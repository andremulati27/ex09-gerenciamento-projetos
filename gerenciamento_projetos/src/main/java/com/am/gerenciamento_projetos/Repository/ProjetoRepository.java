package com.am.gerenciamento_projetos.Repository;
import com.am.gerenciamento_projetos.Model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
