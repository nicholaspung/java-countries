package com.lambdaschool.countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @GetMapping(value = "/size/{people}", produces = {"application/json"})
    public ResponseEntity<?> getCountriesWithPopulationGreaterThan(@PathVariable int people) {
        ArrayList<Country> rtnCountries = CountriesApplication.ourCountryList.findCountries(c -> c.getPopulation() > people);
        rtnCountries.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }

    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> getMinPopulation() {
        CountriesApplication.ourCountryList.countryList.sort((o1, o2) -> o1.getPopulation() - o2.getPopulation());
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList.get(0), HttpStatus.OK);
    }

    @GetMapping(value = "/max", produces = {"application/json"})
    public ResponseEntity<?> getMaxPopulation() {
        CountriesApplication.ourCountryList.countryList.sort((o1, o2) -> o2.getPopulation() - o1.getPopulation());
        return new ResponseEntity<>(CountriesApplication.ourCountryList.countryList.get(0), HttpStatus.OK);
    }

    // Stretch goal
//    @GetMapping(value = "/population/median", produces = {"application/json"})
//    public ResponseEntity<?> getMedianPopulation() {
//        return new ResponseEntity<>();
//    }
}
