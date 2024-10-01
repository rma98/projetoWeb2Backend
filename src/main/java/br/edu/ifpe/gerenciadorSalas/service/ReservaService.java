package br.edu.ifpe.gerenciadorSalas.service;

import br.edu.ifpe.gerenciadorSalas.model.Reserva;
import br.edu.ifpe.gerenciadorSalas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listarTodos() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> buscarPorId(Long id) {
        return reservaRepository.findById(id);
    }

    public List<Reserva> listarPorSalaId(Long salaId) {
        return reservaRepository.findBySalaId(salaId);
    }

    public List<Reserva> listarPorLaboratorioId(Long laboratorioId) {
        return reservaRepository.findByLaboratorioId(laboratorioId);
    }

    public Reserva salvar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void deletarPorId(Long id) {
        reservaRepository.deleteById(id);
    }
}
