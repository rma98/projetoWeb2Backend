package br.edu.ifpe.gerenciadorSalas.service;

import br.edu.ifpe.gerenciadorSalas.model.Sala;
import br.edu.ifpe.gerenciadorSalas.model.StatusSala;
import br.edu.ifpe.gerenciadorSalas.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> listarTodos() {
        return salaRepository.findAll();
    }

    public List<Sala> listarPorStatus(StatusSala status) {
        return salaRepository.findByStatus(status);
    }

    public Optional<Sala> buscarPorId(Long id) {
        return salaRepository.findById(id);
    }

    public Sala salvar(Sala sala) {
        return salaRepository.save(sala);
    }

    public void deletarPorId(Long id) {
        salaRepository.deleteById(id);
    }
}
