package com.am.gerenciamento_projetos.Controller;


import com.am.gerenciamento_projetos.Model.ProjetoModel;
import com.am.gerenciamento_projetos.Services.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public ProjetoModel criarProjeto(@RequestBody ProjetoModel projeto) {
        return service.criarProjeto(projeto);
    }

    @GetMapping
    public List<ProjetoModel> listarProjetos() {
        return service.listarProjetos();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id) {
        service.deletarProjeto(id);
    }
}
