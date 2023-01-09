package com.example.demo.oui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonController {
    @RequestMapping(path = "/toto")
    public ResponseEntity <Coucou> getToto(){
        return new ResponseEntity(new Coucou("salut"), HttpStatus.OK);
    }
}
