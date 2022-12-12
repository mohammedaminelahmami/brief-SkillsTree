package com.example.brief6.service;

import com.example.brief6.dao.UseDaoImpl;
import com.example.brief6.entity.Apprenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantService {

    @Autowired(required = false)
    private UseDaoImpl<Apprenant> apprenantDao = new UseDaoImpl<>(Apprenant.class);
    public List<Apprenant> listApprenant()
    {
        return apprenantDao.getAll();
    }
}