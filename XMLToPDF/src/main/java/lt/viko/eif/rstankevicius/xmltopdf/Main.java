package lt.viko.eif.rstankevicius.xmltopdf;

import org.apache.fop.apps.*;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args){
        try {
            convertToPDF();
        } catch (IOException | FOPException | TransformerException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }

    public static void convertToPDF() throws IOException, FOPException, TransformerException {
        File xsltFile = new File("generate-to-pdf.xsl");
        StreamSource xmlSource = new StreamSource(new File("generate.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        OutputStream out;
        out = new java.io.FileOutputStream("generate.pdf");

        try{
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF,foUserAgent,out);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(xmlSource, res);
        } finally {
            out.close();
        }
    }
}
