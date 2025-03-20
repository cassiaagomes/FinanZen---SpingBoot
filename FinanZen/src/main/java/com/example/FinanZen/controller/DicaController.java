package com.example.FinanZen.controller;

import com.example.FinanZen.model.Dica;
import com.example.FinanZen.service.DicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dicas")
public class DicaController {

    @Autowired
    private DicaService dicaService;

    @PostMapping
    public ResponseEntity<Dica> adicionarDica(@RequestBody Dica dica) {
        Dica savedDica = dicaService.salvarDica(dica);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDica);
    }

    @GetMapping
    public ResponseEntity<Iterable<Dica>> listarDicas() {
        return ResponseEntity.ok(dicaService.listarDicas());
    }
}
