package br.usjt.tempo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.tempo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	public Cidade findByLatitudeAndLongitude(String latitude, String longitude);
	
	public Cidade findByNome(String nome);

	public List<Cidade> findByNomeIgnoreCase(String nome);
}
