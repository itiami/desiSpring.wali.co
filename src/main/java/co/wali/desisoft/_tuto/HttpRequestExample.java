package co.wali.desisoft._tuto;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ObjectStreamException;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    @GetMapping(path = "env")
    public Map<String, String> envInfoFn() {
         return System.getenv();
    }
    
}
