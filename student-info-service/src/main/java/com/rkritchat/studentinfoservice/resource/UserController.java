package com.rkritchat.studentinfoservice.resource;

import com.rkritchat.studentinfoservice.model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/detail")
    public void getuserInfo(){
        LibraryModel library = restTemplate.getForObject("http://localhost:8081", LibraryModel.class);
        System.out.println(library.toString());
    }
}
