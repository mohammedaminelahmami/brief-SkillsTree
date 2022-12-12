package com.example.brief6.config;

import com.example.brief6.dao.UseDaoImpl;
import com.example.brief6.entity.Apprenant;

public class Main {
    public static void main(String[] args) throws Exception {
        UseDaoImpl<Apprenant> apprenantUseDao = new UseDaoImpl<>(Apprenant.class);
        Apprenant apprenant = new Apprenant();

        apprenant.setNom("nom1");
        apprenant.setPrenom("prenom1");
        apprenant.setEmail("email1");
        apprenant.setPassword("motDePasse1");

        apprenantUseDao.save(apprenant);
    }
}