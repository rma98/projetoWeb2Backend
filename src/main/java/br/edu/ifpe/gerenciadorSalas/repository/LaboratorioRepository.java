package br.edu.ifpe.gerenciadorSalas.repository;

import br.edu.ifpe.gerenciadorSalas.model.Laboratorio;
import br.edu.ifpe.gerenciadorSalas.model.StatusLaboratorio;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
    List<Laboratorio> findByStatus(StatusLaboratorio status);
}
