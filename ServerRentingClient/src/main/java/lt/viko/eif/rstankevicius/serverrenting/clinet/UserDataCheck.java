
package lt.viko.eif.rstankevicius.serverrenting.clinet;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserDataCheck", targetNamespace = "http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserDataCheck {


    /**
     * 
     * @param getUserDataCheckRequest
     * @return
     *     returns lt.viko.eid.rstankevicius.serverrenting.clinet.GetUserDataCheckResponse
     */
    @WebMethod
    @WebResult(name = "getUserDataCheckResponse", targetNamespace = "http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck", partName = "getUserDataCheckResponse")
    public GetUserDataCheckResponse getUserDataCheck(
        @WebParam(name = "getUserDataCheckRequest", targetNamespace = "http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck", partName = "getUserDataCheckRequest")
        GetUserDataCheckRequest getUserDataCheckRequest);

}