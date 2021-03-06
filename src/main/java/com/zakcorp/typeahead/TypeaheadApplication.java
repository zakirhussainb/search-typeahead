/*
 * Copyright  : ZakCorp (c) Zakir Hussain
 * License    : MIT
 * Maintainer : zakirhussainb2693@gmail.com
 * Stability  : stable
 */

package com.zakcorp.typeahead;

import com.zakcorp.typeahead.service.SearchService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TypeaheadApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeaheadApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		SearchService service = new SearchService();
		service.insertNewWord("AJMER");
		service.insertNewWord("AGRA");
		service.insertNewWord("BHOPAL");
		service.insertNewWord("BIDAR");
		service.insertNewWord("CHENNAI");
		service.insertNewWord("CUTTAK");
		service.insertNewWord("DELHI");
		service.insertNewWord("DHANBAD");
		service.insertNewWord("GAYA");
		service.insertNewWord("GURGAON");
		service.insertNewWord("GUNTUR");
	}*/
}
