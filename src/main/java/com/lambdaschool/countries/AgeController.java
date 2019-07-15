package com.lambdaschool.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController {
    @GetMapping(value = "/age/{age}", produces = {"application/json"})
    public ResponseEntity<?> getMedianAgeOver(@PathVariable int age) {
        ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.findCountries(c -> c.getMedianAge() > age);
        rtnCountries.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }

    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getMinAge() {
        CountriesApplication.ourCountryList.countryList.sort((o1, o2) -> o1.getMedianAge() - o2.getMedianAge());
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList.get(0), HttpStatus.OK);
    }

    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getMaxAge() {
        CountriesApplication.ourCountryList.countryList.sort((o1, o2) -> o2.getMedianAge() - o1.getMedianAge());
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList.get(0), HttpStatus.OK);
    }

    // Stretch goal
//    @GetMapping(value = "/age/median", produces = {"application/json"})
//    public ResponseEntity<?> getMedianMedianAge() {
//        return new ResponseEntity<>();
//    }
}
