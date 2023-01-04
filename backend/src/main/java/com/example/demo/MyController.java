package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-controller")
public class MyController {

    @RequestMapping(value = "ping", method = RequestMethod.GET, produces = "application/json")
    public String helloWorlds() {
        return "pong";
    }

    @RequestMapping(
            value = "/user",
            method = RequestMethod.GET,
            produces = {"application/json"}
    )
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.setName("babla");
        return ResponseEntity.ok().body(user);
    }
}
