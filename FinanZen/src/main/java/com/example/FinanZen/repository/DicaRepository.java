package com.example.FinanZen.repository;

import com.example.FinanZen.model.Dica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DicaRepository extends JpaRepository<Dica, Long> {
    // Não é necessário adicionar métodos customizados se você for usar os métodos padrões do JpaRepository
    // Caso queira adicionar um método customizado para inserir várias dicas:
    // List<Dica> saveAll(List<Dica> dicas);
}
