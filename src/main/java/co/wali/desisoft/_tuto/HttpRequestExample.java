package co.wali.desisoft._tuto;


import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tuto")
public class HttpRequestExample {

    @GetMapping
    public String asString(){
        return ("GET request As String..");
    }


    @GetMapping(path = "asObject", produces = "application/json")
    public String asObject(){
        JSONObject menuItem_1 = new JSONObject();
        menuItem_1.put("home", "/home");
        menuItem_1.put("about", "/about");
        menuItem_1.put("contact", "/contact");
        return (menuItem_1.toString());
    }
}
