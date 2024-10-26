package br.edu.ifpe.gerenciadorSalas.service;

import br.edu.ifpe.gerenciadorSalas.model.Reserva;
import br.edu.ifpe.gerenciadorSalas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public boolean existeConflito(Reserva novaReserva) {
        // Busca reservas que tenham sobreposição de horário para a mesma sala ou laboratório
        List<Reserva> reservasConflitantes = reservaRepository
                .findBySalaOrLaboratorioAndDataInicioBeforeAndDataFimAfter(
                        novaReserva.getSala(),
                        novaReserva.getLaboratorio(),
                        novaReserva.getDataFim(),
                        novaReserva.getDataInicio()
                );
        return !reservasConflitantes.isEmpty();
    }

    public Reserva criarReserva(Reserva novaReserva) {
        if (existeConflito(novaReserva)) {
            throw new IllegalArgumentException("Conflito de horário: esta sala ou laboratório já está reservado.");
        }
        return reservaRepository.save(novaReserva);
    }
}
