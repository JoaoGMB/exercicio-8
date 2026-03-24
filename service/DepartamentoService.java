
package com.exemplo.departamento.service;

import com.exemplo.departamento.entity.Departamento;
import com.exemplo.departamento.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public Departamento salvar(Departamento d) {
        return repository.save(d);
    }

    public List<Departamento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Departamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
