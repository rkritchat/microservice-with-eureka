package com.rkritchat.schoolsubjectinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolSubjectModel {

    private List<SubjectModel> subjects;

}
