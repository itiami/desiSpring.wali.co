package co.wali.desisoft;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class HTML_Template {

    @GetMapping("/index")
    public Mono<String> indexFn(Model model){
        model.addAttribute("msg","Spring Boot with Reactive Web - in Gradle");
        return Mono.just("index");
    }

}
