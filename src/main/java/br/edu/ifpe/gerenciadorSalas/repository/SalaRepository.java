package br.edu.ifpe.gerenciadorSalas.repository;

import br.edu.ifpe.gerenciadorSalas.model.Sala;
import br.edu.ifpe.gerenciadorSalas.model.StatusSala;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    List<Sala> findByStatus(StatusSala status); // Para buscar salas com base no status (disponível ou indisponível)
}
