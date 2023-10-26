package io.getarrays.cicdpipeline.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (<a href="https://www.getarrays.io">Get Arrays, LLC</a>)
 * @email getarrayz@gmail.com
 * @since 10/23/2023
 */

@RestController
//@RequestMapping(path = "/test")
public class TestController {


    @GetMapping
    public ResponseEntity<Map<String, String>> healthcheck() {
        return ResponseEntity.ok().body(Map.of("Status", "Up"));
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(Map.of("Testing", "Test Data"));
    }
}