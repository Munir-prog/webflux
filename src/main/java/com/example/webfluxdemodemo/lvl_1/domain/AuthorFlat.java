package com.example.webfluxdemodemo.lvl_1.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class AuthorFlat {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final int yearOfBirth;
    private final List<Long> books;
}
