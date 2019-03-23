package com.rkritchat.studentinfoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String id;
    private String firstName;
    private String lastName;
    private SchoolObjectModel schoolObjectModel;
    private LibraryModel libraryModel;

}
