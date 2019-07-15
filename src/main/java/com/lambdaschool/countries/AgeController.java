package com.lambdaschool.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {
    @RequestMapping("/age/{age}")
    public ResponseEntity<?> getMedianAgeOver(@PathVariable int age) {
        return new ResponseEntity<>();
    }

    @RequestMapping("/age/min")
    public ResponseEntity<?> getMinAge() {
        return new ResponseEntity<>();
    }

    @RequestMapping("/age/max")
    public ResponseEntity<?> getMaxAge() {
        return new ResponseEntity<>();
    }

    // Stretch goal
//    @RequestMapping("/age/median")
//    public ResponseEntity<?> getMedianMedianAge() {
//        return new ResponseEntity<>();
//    }
}
