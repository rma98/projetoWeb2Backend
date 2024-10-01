package br.edu.ifpe.gerenciadorSalas.repository;

import br.edu.ifpe.gerenciadorSalas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findBySalaId(Long salaId);
    List<Reserva> findByLaboratorioId(Long laboratorioId);
    List<Reserva> findByUsuarioId(Long usuarioId);
}
