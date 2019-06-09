package com.zakcorp.typeahead.web.rest;

import com.zakcorp.typeahead.service.SearchService;
import com.zakcorp.typeahead.web.vm.ResponseVM;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class SearchResource {

    private final SearchService searchService;

    @Autowired
    public SearchResource(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/insertWord")
    @ResponseStatus(HttpStatus.OK)
    public void insertWord(String word) {
        searchService.insertNewWord(word);
    }

    @GetMapping("/getWords/{prefix}")
    public ResponseEntity<ResponseVM> getWordsByPrefix(@PathVariable String prefix) {
        ResponseVM response = new ResponseVM();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
