package pl.kaminski.soapconsumer;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.kaminski.soapconsumer.wsdlclass.wsdl.RegisterCallRequest;
import pl.kaminski.soapconsumer.wsdlclass.wsdl.RegisterCallResponse;
import pl.kaminski.soapconsumer.wsdlclass.wsdl.ResultsRequest;
import pl.kaminski.soapconsumer.wsdlclass.wsdl.ResultsResponse;


public class SoapClient extends WebServiceGatewaySupport {


    public RegisterCallResponse getRegisterCall(String student) {
        RegisterCallRequest request = new RegisterCallRequest();
        request.setStudent(student);

        return (RegisterCallResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }


    public ResultsResponse getResults(String student) {
        ResultsRequest request = new ResultsRequest();
        request.setStudent(student);

        return (ResultsResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }
}
