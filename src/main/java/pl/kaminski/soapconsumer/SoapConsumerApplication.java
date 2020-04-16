package pl.kaminski.soapconsumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.kaminski.soapconsumer.wsdlclass.wsdl.RegisterCallResponse;

@SpringBootApplication
public class SoapConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapConsumerApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SoapClient client) {
        return args -> {
            String student = "remek";

            if (args.length > 0) {
                student = args[0];
            }
            RegisterCallResponse response = client.getRegisterCall(student);
            System.err.println(response.getExercise().getName());
        };
    }

}
