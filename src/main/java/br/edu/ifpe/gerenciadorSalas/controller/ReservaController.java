package br.edu.ifpe.gerenciadorSalas.controller;

import br.edu.ifpe.gerenciadorSalas.model.Reserva;
import br.edu.ifpe.gerenciadorSalas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<String> criarReserva(@RequestBody Reserva novaReserva) {
        try {
            reservaService.criarReserva(novaReserva);
            return ResponseEntity.ok("Reserva criada com sucesso!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
