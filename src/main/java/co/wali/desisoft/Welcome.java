package co.wali.desisoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping
    public String welcomeFn(){
        return "Spring Boot with WebFlux and Gradle";
    }
}
