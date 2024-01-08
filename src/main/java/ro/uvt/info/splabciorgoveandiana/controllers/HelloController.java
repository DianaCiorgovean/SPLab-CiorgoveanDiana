package ro.uvt.info.splabciorgoveandiana.controllers;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HelloController {
//
//    @GetMapping("/")
//    public String hello() {
//        return "Hello from Spring Boot";
//    }
//}

import  ro.uvt.info.splabciorgoveandiana.difexample.ClientComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClientComponent clientComponent;

    @Autowired
    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}
