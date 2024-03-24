package co.wali.desisoft._tuto;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/tuto")
public class HttpRequestExample {
    // http://192.168.1.235:3010  .. Here Content-type text/plain;charset=UTF-8
    @GetMapping
    public String asString(){
        return ("GET request As String..");
    }

    // http://192.168.1.235:3010/tuto/objAsString  .. Here we manualy declar it's a application/json
    @GetMapping(path = "objAsString", produces = "application/json")
    public String objAsString(){
        JSONObject menuItem_1 = new JSONObject();
        menuItem_1.put("home", "/home");
        menuItem_1.put("about", "/about");
        menuItem_1.put("contact", "/contact");
        return (menuItem_1.toString());
    }

    // http://192.168.1.235:3010/tuto/asObj
    // note: although the JSONObject is not java's built in library but the Spring Boot recognise as Json object.
    // so the Content-type will be automatically application/json
    @GetMapping(path = "asObj")
    public JSONObject asObject(){
        JSONObject menuItem_1 = new JSONObject();
        menuItem_1.put("home", "/home");
        menuItem_1.put("about", "/about");
        menuItem_1.put("contact", "/contact");
        return menuItem_1;
    }
    /*
     {
        "empty": false,
        "mapType": "java.util.HashMap"
      }
    */


    // http://192.168.1.235:3010/tuto/hashMap  .. and it's a application/json
    @GetMapping(path = "hashMap")
    public Map<String, Object> asHashMap(){
        JSONObject menuItem_1 = new JSONObject();
        menuItem_1.put("home", "/home");
        menuItem_1.put("about", "/about");
        menuItem_1.put("contact", "/contact");
        return menuItem_1.toMap();
    }


    // http://192.168.1.235:3010/tuto/asList  .. and it's a application/json
    @GetMapping(path = "asList")
    public List<String> asList(){
        return new ArrayList<>(Arrays.asList("item_1","item_2","item_3"));
    }


    // http://192.168.1.235:3010/tuto/env  .. and it's a application/json
    @GetMapping(path = "env")
    public Map<String, String> envInfoFn() {
         return System.getenv();
    }


    // http://192.168.1.235:3010/tuto?pId=101
    // example of a query param
    @GetMapping(path = "id")
    public String getEmployeesById(
            @RequestParam(name = "pId", required = false) String id) {
        return "ID: " + id;
    }


    // example of query path..
    // http://192.168.1.235:3010/product/keyboard
    @GetMapping("{name}")
    public String getProductByName(@PathVariable String name) {
        return "you have Typed.." + name;
    }


    @GetMapping("/test/{name}")
    public String getByName(@PathVariable String name) {
        return name;
    }
    // what is ResponseEntity<?>



}

