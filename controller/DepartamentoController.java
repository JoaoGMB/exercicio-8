
package com.exemplo.departamento.controller;

import com.exemplo.departamento.entity.Departamento;
import com.exemplo.departamento.service.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private final DepartamentoService service;

    public DepartamentoController(DepartamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Departamento criar(@RequestBody Departamento d) {
        return service.salvar(d);
    }

    @GetMapping
    public List<Departamento> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Departamento buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
