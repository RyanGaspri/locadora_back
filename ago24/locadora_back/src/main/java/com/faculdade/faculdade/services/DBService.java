package com.faculdade.faculdade.services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.faculdade.faculdade.entities.Aluno;
import com.faculdade.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service
public class DBService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Bean
    public void instanciarDB() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


//        System.out.println(alunoRepository.findAll());
    }
}
