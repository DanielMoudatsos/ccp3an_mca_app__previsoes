package br.usjt.tempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.tempo.model.PrevisaoTempo;

@Repository
public interface PrevisaoTempoRepository extends JpaRepository<PrevisaoTempo, Long>{

}
