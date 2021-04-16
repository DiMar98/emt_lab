package com.lab.librarian.models.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CountryNotFound extends RuntimeException{

    public CountryNotFound(Long id) {
        super(String.format("Country with id: %d was not found",id));
    }
}
