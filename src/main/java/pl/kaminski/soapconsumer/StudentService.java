package pl.kaminski.soapconsumer;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.kaminski.soapconsumer.consumingwebservice.wsdl.ResultsRequest;

@Service
public class StudentService extends WebServiceGatewaySupport {

    @EventListener(ApplicationReadyEvent.class)
    public String getStudent() {
        ResultsRequest resultsRequest = new ResultsRequest();
        resultsRequest.setStudent("Marek");
        String student1 = resultsRequest.getStudent();
        System.out.println(student1);
        return student1;
    }

}
