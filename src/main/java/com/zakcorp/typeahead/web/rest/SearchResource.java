/*
 * Copyright  : ZakCorp (c) Zakir Hussain
 * License    : MIT
 * Maintainer : zakirhussainb2693@gmail.com
 * Stability  : stable
 */

package com.zakcorp.typeahead.web.rest;

import com.zakcorp.typeahead.service.SearchService;
import com.zakcorp.typeahead.web.vm.ResponseVM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class SearchResource {

    private final SearchService searchService;

    @Autowired
    public SearchResource(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping(path = "/insertWord")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ResponseVM> insertWord(@RequestBody String word) {
        searchService.insertNewWord(word);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getWords/{prefix}")
    public ResponseEntity<ResponseVM> getWordsByPrefix(@PathVariable String prefix) {
        ResponseVM response = new ResponseVM();
        response.setData(searchService.getWordsByPrefix(prefix).toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "/bulkUploadWords")
    public ResponseEntity<ResponseVM> bulkUploadWords(@RequestBody List<String> words) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
