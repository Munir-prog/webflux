package com.example.webfluxdemodemo.lvl_4.external.service.implementation.repository.raw;

import com.example.webfluxdemodemo.lvl_1.domain.AuthorFlat;
import com.example.webfluxdemodemo.lvl_1.domain.BookFlat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("authors_with_books_id")
@NoArgsConstructor
@AllArgsConstructor
public class AuthorRaw {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private List<Long> books;

    public AuthorFlat toAuthorFlat() {
        return new AuthorFlat(id, firstName, lastName, yearOfBirth, books);
    }

    public static AuthorRaw from(AuthorFlat flat) {
        return new AuthorRaw(
                flat.getId(),
                flat.getFirstName(),
                flat.getLastName(),
                flat.getYearOfBirth(),
                flat.getBooks());
    }

}
