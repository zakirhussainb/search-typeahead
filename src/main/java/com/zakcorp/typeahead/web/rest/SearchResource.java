package com.zakcorp.typeahead.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class SearchResource {

    @PostMapping("/insertWord")
    @ResponseStatus(HttpStatus.OK)
    public String insertWord(String word) {
        return null;
    }



}
