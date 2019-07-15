package com.lambdaschool.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @RequestMapping("/size/{people}")
    public ResponseEntity<?> getPopulationOver(@PathVariable int people) {
        return new ResponseEntity<>();
    }

    @RequestMapping("/min")
    public ResponseEntity<?> getMinPopulation() {
        return new ResponseEntity<>();
    }

    @RequestMapping("/max")
    public ResponseEntity<?> getMaxPopulation() {
        return new ResponseEntity<>();
    }

    // Stretch goal
//    @RequestMapping("/population/median")
//    public ResponseEntity<?> getMedianPopulation() {
//        return new ResponseEntity<>();
//    }
}
