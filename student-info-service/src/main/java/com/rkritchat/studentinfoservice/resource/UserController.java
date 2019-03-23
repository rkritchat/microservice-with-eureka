package com.rkritchat.studentinfoservice.resource;

import com.rkritchat.studentinfoservice.model.LibraryModel;
import com.rkritchat.studentinfoservice.model.SchoolSubjectModel;
import com.rkritchat.studentinfoservice.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/detail")
    public UserModel getuserInfo(@RequestBody UserModel userModel) {

        UserModel response = mockUserModel();
        LibraryModel libraryModel = callLibraryService(userModel.getId());
        SchoolSubjectModel schoolSubjectModel = callSchoolSubjectService(userModel.getId());
        response.setLibraryModel(libraryModel);
        response.setSchoolSubjectModel(schoolSubjectModel);
        return response;

    }

    private SchoolSubjectModel callSchoolSubjectService(String id) {
        return restTemplate.getForObject("http://localhost:8084/school/subject/" + id, SchoolSubjectModel.class);

    }

    private UserModel mockUserModel() {
        UserModel userModel = new UserModel();
        userModel.setFirstName("Kritchat");
        userModel.setLastName("Rojanaphruk");
        userModel.setId("rkritchat");

        logger.info("UserModel : {}", userModel);
        return userModel;
    }

    private LibraryModel callLibraryService(String userId) {
        return restTemplate.getForObject("http://localhost:8083/library/" + userId, LibraryModel.class);
    }
}
