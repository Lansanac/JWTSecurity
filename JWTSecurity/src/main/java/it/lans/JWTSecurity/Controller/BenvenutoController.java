package it.lans.JWTSecurity.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BenvenutoController {

    @GetMapping("/benvenut")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Ciao mio API!");
    }

    @GetMapping("/saluto")
    public ResponseEntity<String> saluta(){
        return ResponseEntity.ok("Saluto monda a dopo!!");
    }
}
