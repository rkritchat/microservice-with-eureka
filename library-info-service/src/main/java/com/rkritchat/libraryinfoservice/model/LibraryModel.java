package com.rkritchat.libraryinfoservice.model;

import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryModel {

    private List<BookModel> books;

}
