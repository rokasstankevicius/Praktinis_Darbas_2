package lt.viko.eif.rstankevicius.serverrenting.api.endpoint;


import lt.viko.eif.rstankevicius.serverrenting.api.models.GetUserDataCheckRequest;
import lt.viko.eif.rstankevicius.serverrenting.api.models.GetUserDataCheckResponse;
import lt.viko.eif.rstankevicius.serverrenting.api.services.UserDataCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Endpoint
public class UserDataCheckEndpoint {

    private static final String NAMESPACE = "http://www.ServerRenting.lt/viko/eif/rstankevicius/serverrenting/api/userDataCheck";

    @Autowired
    private UserDataCheckService service;

    @PayloadRoot(namespace = NAMESPACE,localPart = "getUserDataCheckRequest")
    @ResponsePayload
//    public GetUserDataCheckResponse getResponse (@RequestPayload GetUserDataCheckRequest request){
//        return service.checkUserData(request);
//    }
    public JAXBElement<GetUserDataCheckResponse> getResponse (@RequestPayload JAXBElement<GetUserDataCheckRequest> request){
        GetUserDataCheckResponse response = new GetUserDataCheckResponse();
        response.setCheck(service.checkUserData(request.getValue()));
        return createResponseJaxbElement(response, GetUserDataCheckResponse.class);
    }
    private JAXBElement createResponseJaxbElement(GetUserDataCheckResponse object, Class clazz) {

        return new JAXBElement<>(new QName(NAMESPACE, clazz.getSimpleName()), clazz, object);

    }
}
