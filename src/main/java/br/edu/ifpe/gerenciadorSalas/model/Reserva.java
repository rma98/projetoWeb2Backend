package br.edu.ifpe.gerenciadorSalas.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataInicio;

    private LocalDateTime dataFim;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = true)
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "laboratorio_id", nullable = true)
    private Laboratorio laboratorio;

    @ManyToOne
    @JoinColumn(name = "recurso_id", nullable = true)
    private Recurso recurso;
}