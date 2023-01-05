package it.lans.JWTSecurity.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/benvenuto")
public class BenvenutoController {


    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Ciao mio API!");
    }

    @GetMapping("saluto")
    public ResponseEntity<String> saluto(){
        return ResponseEntity.ok("Saluto monda a dopo!!");
    }
}
