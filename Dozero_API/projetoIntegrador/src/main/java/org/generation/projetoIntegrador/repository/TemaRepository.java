package org.generation.projetoIntegrador.repository;


import java.util.List;
import org.generation.projetoIntegrador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema>findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Tema>findAllByDescricaoContainingIgnoreCase(String descricao);
}
