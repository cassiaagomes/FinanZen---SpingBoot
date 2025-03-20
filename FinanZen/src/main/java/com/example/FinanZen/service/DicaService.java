package com.example.FinanZen.service;

import com.example.FinanZen.model.Dica;
import com.example.FinanZen.repository.DicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class DicaService {

    @Autowired
    private DicaRepository dicaRepository;

    public Dica salvarDica(Dica dica) {
        return dicaRepository.save(dica);
    }

    public void salvarDicasIniciais() {
        List<Dica> dicas = Arrays.asList(
            new Dica("Pague suas dívidas o quanto antes, isso vai te liberar para investir no futuro!"),
            new Dica("Sempre tenha uma reserva de emergência para imprevistos, como reparos ou doenças."),
            new Dica("Evite o uso excessivo do cartão de crédito. A dívida de crédito pode te surpreender com juros altos."),
            new Dica("Faça um planejamento mensal para controlar seus gastos e evitar surpresas no final do mês."),
            new Dica("Antes de comprar algo por impulso, pense: ‘Eu realmente preciso disso?’"),
            new Dica("Invista em sua educação financeira. Conhecimento é a chave para tomar decisões inteligentes."),
            new Dica("Cuidado com empréstimos rápidos. Verifique as taxas de juros antes de assinar qualquer contrato."),
            new Dica("Divida suas finanças em categorias: moradia, alimentação, transporte, lazer, e poupança."),
            new Dica("Poupar 10% do que você ganha pode te ajudar a conquistar a independência financeira."),
            new Dica("Evite compras parceladas no cartão de crédito, pois os juros podem transformar uma boa compra em um grande peso.")
        );

        dicaRepository.saveAll(dicas);
    }

    @PostConstruct
    public void inicializarDicas() {
        salvarDicasIniciais();
    }

    public Iterable<Dica> listarDicas() {
        return dicaRepository.findAll();
    }
}

