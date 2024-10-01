package br.edu.ifpe.gerenciadorSalas.service;

import br.edu.ifpe.gerenciadorSalas.model.Laboratorio;
import br.edu.ifpe.gerenciadorSalas.model.StatusLaboratorio;
import br.edu.ifpe.gerenciadorSalas.repository.LaboratorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaboratorioService {

    @Autowired
    private LaboratorioRepository laboratorioRepository;

    public List<Laboratorio> listarTodos() {
        return laboratorioRepository.findAll();
    }

    public List<Laboratorio> listarPorStatus(StatusLaboratorio status) {
        return laboratorioRepository.findByStatus(status);
    }

    public Optional<Laboratorio> buscarPorId(Long id) {
        return laboratorioRepository.findById(id);
    }

    public Laboratorio salvar(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);
    }

    public void deletarPorId(Long id) {
        laboratorioRepository.deleteById(id);
    }
}
