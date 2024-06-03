package com.animax.demo.constants.old.ukg;


import java.net.URISyntaxException;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("endpoint/v1/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(List<User> users) throws URISyntaxException {
        if(!users.isEmpty()) {
            String id = userService.addAndSendUser(users);
            return ResponseEntity.ok(id);
        }
        return (ResponseEntity<Object>) ResponseEntity.internalServerError();
    }

    //POST
    //PATCh
    //

}
