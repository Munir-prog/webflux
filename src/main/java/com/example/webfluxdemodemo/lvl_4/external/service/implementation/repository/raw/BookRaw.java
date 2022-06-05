package com.example.webfluxdemodemo.lvl_4.external.service.implementation.repository.raw;

import com.example.webfluxdemodemo.lvl_1.domain.Book;
import com.example.webfluxdemodemo.lvl_1.domain.BookFlat;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("books_with_authors_id")
public class BookRaw {
    @Id
    private long id;
    private String bookName;
    private int yearOfRelease;
    private List<Long> authors;

    public BookFlat toBookFlat() {
        return new BookFlat(id, bookName, yearOfRelease, authors);
    }
}
