package com.lambdaschool.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NamesController {
    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllNames() {
        CountriesApplication.ourCountryList.countryList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList, HttpStatus.OK);
    }

    @GetMapping(value = "/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> getCountriesAlphabeticallyBeginningWith(@PathVariable char letter) {
        ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.findCountries(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        rtnCountries.sort((o1, o2) -> (int)(o1.getName().compareToIgnoreCase(o2.getName())));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }

    @GetMapping(value = "/size/{number}", produces = {"application/json"})
    public ResponseEntity<?> getCountriesWithNamesGreaterThan(@PathVariable int number) {
        ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.findCountries(c -> c.getName().length() > number);
        rtnCountries.sort((o1, o2) -> (int)(o1.getName().compareToIgnoreCase(o2.getName())));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }
}
