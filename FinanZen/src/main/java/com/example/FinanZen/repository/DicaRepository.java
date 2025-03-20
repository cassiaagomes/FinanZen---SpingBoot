package com.example.FinanZen.repository;

import com.example.FinanZen.model.Dica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DicaRepository extends JpaRepository<Dica, Long> {
    // List<Dica> saveAll(List<Dica> dicas);
}
