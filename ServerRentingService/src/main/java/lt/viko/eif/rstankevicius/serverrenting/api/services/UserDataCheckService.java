package lt.viko.eif.rstankevicius.serverrenting.api.services;



import lt.viko.eif.rstankevicius.serverrenting.api.models.DedicatedServersType;
import lt.viko.eif.rstankevicius.serverrenting.api.models.UserDataCheck;
import lt.viko.eif.rstankevicius.serverrenting.api.models.UserDataType;
import lt.viko.eif.rstankevicius.serverrenting.api.models.*;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.StringReader;
import java.util.List;

@Service
public class UserDataCheckService {

    public UserDataCheck checkUserData(GetUserDataCheckRequest request){
        //GetUserDataCheckResponse response = new GetUserDataCheckResponse();
        //System.out.println("hello");
        UserDataCheck userDataCheck = new UserDataCheck();
        int id = request.getId();

        UserDataType userDataType = XMLToObject();

        assert userDataType != null;
        if(userDataType.getId() == id) {
            List<DedicatedServersType> dedicatedServerList = userDataType.getUserPackage().getDedicatedServers();
            List<CloudServersType> cloudServerList = userDataType.getUserPackage().getCloudServers();

            if (!(dedicatedServerList.isEmpty())) {
                userDataCheck.setHasDedicatedServers(true);
            }
            if (!(cloudServerList.isEmpty())) {
                userDataCheck.setHasCloudServers(true);
            }
            if (userDataCheck.isHasDedicatedServers() && userDataCheck.isHasCloudServers()) {
                userDataCheck.setPrice(userDataType.getUserPackage().getPrice());

                for (DedicatedServersType dedicatedServer : dedicatedServerList) {
                    userDataCheck.setAmountOfDedicatedServers(userDataCheck.getAmountOfDedicatedServers() + 1);
                }

                for (CloudServersType cloudServer : cloudServerList) {
                    userDataCheck.setAmountOfCloudServers(userDataCheck.getAmountOfCloudServers() + 1);
                }
            }
            //response.setCheck(userDataCheck);
        }
        return userDataCheck;
    }

    //unimplemented
    private static UserDataType XMLToObject(){
        try
        {
//            JAXBContext jaxbContext = JAXBContext.newInstance(UserDataType.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            //Schema employeeSchema = sf.newSchema(new File("generate.xsd"));
//            //Schema employeeSchema = sf.newSchema(new File("userdata1.xsd"));
//            Schema employeeSchema = sf.newSchema(new File("userdataToWDSL.xsd"));
//            jaxbUnmarshaller.setSchema(employeeSchema);
//            UserDataType user = (UserDataType) jaxbUnmarshaller.unmarshal(new File("userdata.xml"));
//            System.out.println(user);

            JAXBContext jaxbContext = JAXBContext.newInstance(UserDataType.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            SchemaFactory schemaFactory = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
            unmarshaller.setSchema(schemaFactory.newSchema(new StreamSource(new File("userdataToWDSL.xsd"))));

            UserDataType user = (UserDataType) unmarshaller.unmarshal(new File("userdata.xml"));

            return user;
        }
        catch (JAXBException | SAXException e)
        {
            e.printStackTrace();
            return null;
        }
    }


}
