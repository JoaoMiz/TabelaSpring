package com.fullstack.Mizael.service;
import com.fullstack.Mizael.repository.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TabelaService {

    private final TabelaRepository repository;

    @Autowired
    public TabelaService(TabelaRepository repository) {
        this.repository = repository;
    }
}
