package br.edu.ifpe.gerenciadorSalas.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;
}
