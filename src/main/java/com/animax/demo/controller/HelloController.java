package com.animax.demo.controller;

import com.animax.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("helloService/v1")
public class HelloController {

    final String HELLO = "hello";
    @Autowired
    private HelloService helloService;

    // http://localhost:8080/helloService/v1/getHello/hello
    @GetMapping("getHello/{id}")
    public ResponseEntity<String> getHello(@PathVariable("id") String id) {
        if (id.equalsIgnoreCase(HELLO)) {
            String result = helloService.getHelloById();
            return ResponseEntity.status(HttpStatus.OK).body(result);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid id");
        }
    }

    // http://localhost:8080/helloService/v1/getHello?id=hello
    @GetMapping(value = "getHello")
    public ResponseEntity<String> getHelloById(@RequestParam(value = "id", required = true) String id) {
        if (id.equalsIgnoreCase(HELLO)) {
            String result = helloService.getHelloById();
            return ResponseEntity.status(HttpStatus.OK).body(result);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid id");
        }
    }
}
