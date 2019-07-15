package com.lambdaschool.countries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {
//    @GetMapping(value = "/age/{age}", produces = {"application/json"})
//    public ResponseEntity<?> getMedianAgeOver(@PathVariable int age) {
//        return new ResponseEntity<>();
//    }
//
//    @GetMapping(value = "/age/min", produces = {"application/json"})
//    public ResponseEntity<?> getMinAge() {
//        return new ResponseEntity<>();
//    }
//
//    @GetMapping(value = "/age/max", produces = {"application/json"})
//    public ResponseEntity<?> getMaxAge() {
//        return new ResponseEntity<>();
//    }

    // Stretch goal
//    @GetMapping(value = "/age/median", produces = {"application/json"})
//    public ResponseEntity<?> getMedianMedianAge() {
//        return new ResponseEntity<>();
//    }
}
