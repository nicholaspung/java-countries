package com.lambdaschool.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class NamesController {
    @RequestMapping("/all")
    public ResponseEntity<?> getAllNames() {
        return new ResponseEntity<>();
    }

    @RequestMapping("/start/{letter}")
    public ResponseEntity<?> getCountriesAlphabeticallyBeginningWith(@PathVariable String letter) {
        return new ResponseEntity<>();
    }

    @RequestMapping("/size/{number}")
    public ResponseEntity<?> getCountriesWithNamesGreaterThan(@PathVariable int number) {
        return new ResponseEntity<>();
    }

    @RequestMapping("/size/{people}")
    public ResponseEntity<?> getCountriesWithPopulationGreaterThan(@PathVariable int population) {
        return new ResponseEntity<>();
    }
}
