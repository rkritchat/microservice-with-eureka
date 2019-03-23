package com.rkritchat.libraryinfoservice.resource;

import com.rkritchat.libraryinfoservice.model.BookModel;
import com.rkritchat.libraryinfoservice.model.LibraryModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    Logger logger = LoggerFactory.getLogger(LibraryController.class);

    @GetMapping("/{userId}")
    public LibraryModel getLibraryDetail(@PathParam("userId") String userId) {
        logger.info("User id : {}", userId);
        LibraryModel mockLibrary = new LibraryModel();
        mockLibraryModel(mockLibrary);
        return mockLibrary;
    }

    private void mockLibraryModel(LibraryModel mockLibrary) {
        BookModel bookModel = new BookModel();
        bookModel.setName("Harry Potter");
        bookModel.setPrice("1000.00");
        List<BookModel> books = Arrays.asList(bookModel);
        mockLibrary.setBooks(books);
    }
}
