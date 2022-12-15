package com.example.brief6.config;

import com.example.brief6.dao.UseDaoImpl;
import com.example.brief6.entity.Apprenant;
import com.example.brief6.entity.Referenciel;
import com.example.brief6.service.ReferencielService;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        UseDaoImpl<Referenciel> referencielDao = new UseDaoImpl<>(Referenciel.class);
//        Referenciel referenciel = new Referenciel();
//
//        referenciel.setName("blabla");
//
//        referencielDao.save(referenciel);

        ReferencielService referencielService = new ReferencielService();
        List<Referenciel> referenciels = referencielService.getAll();
        referenciels.forEach(ref -> System.out.println(ref));


    }
}