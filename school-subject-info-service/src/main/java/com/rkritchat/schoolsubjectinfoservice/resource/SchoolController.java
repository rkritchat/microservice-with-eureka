package com.rkritchat.schoolsubjectinfoservice.resource;

import com.rkritchat.schoolsubjectinfoservice.model.SchoolSubjectModel;
import com.rkritchat.schoolsubjectinfoservice.model.SubjectModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private Logger logger = LoggerFactory.getLogger(SchoolController.class);

    @GetMapping("/subject/{userId}")
    public SchoolSubjectModel getSchoolSubject(@PathParam("userId") String userId) {
        logger.info("UserId : {}" , userId);
        SchoolSubjectModel response = mockSchoolSubject();
        return response;
    }

    private SchoolSubjectModel mockSchoolSubject() {
        SchoolSubjectModel schoolSubjectModel = new SchoolSubjectModel();
        SubjectModel subjectModel = new SubjectModel();
        subjectModel.setId("00001");
        subjectModel.setName("Math");
        List<SubjectModel> subjects = Arrays.asList(subjectModel);
        schoolSubjectModel.setSubjects(subjects);
        return schoolSubjectModel;
    }

}
