package com.am.gerenciamento_projetos.Services;


import com.am.gerenciamento_projetos.Model.ProjetoModel;
import com.am.gerenciamento_projetos.Repository.ProjetoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public ProjetoModel criarProjeto(ProjetoModel projeto) {
        return repository.save(projeto);
    }

    public List<ProjetoModel> listarProjetos() {
        return repository.findAll();
    }

    public Optional<ProjetoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarProjeto(Long id) {
        repository.deleteById(id);
    }
}
