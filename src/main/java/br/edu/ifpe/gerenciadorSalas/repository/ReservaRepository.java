package br.edu.ifpe.gerenciadorSalas.repository;

import br.edu.ifpe.gerenciadorSalas.model.Reserva;
import br.edu.ifpe.gerenciadorSalas.model.Sala;
import br.edu.ifpe.gerenciadorSalas.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
    List<Reserva> findBySalaOrLaboratorioAndDataInicioBeforeAndDataFimAfter(
            Sala sala,
            Laboratorio laboratorio,
            LocalDateTime dataFim,
            LocalDateTime dataInicio
    );
}
