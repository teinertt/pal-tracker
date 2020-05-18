package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.event.WindowListener;

@RestController
public class WelcomeController {

    private final String message;

    //Set welcome message and output
    public WelcomeController (@Value("${welcome.message}") String message){
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}
