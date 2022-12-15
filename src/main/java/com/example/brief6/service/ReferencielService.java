package com.example.brief6.service;

import com.example.brief6.dao.UseDaoImpl;
import com.example.brief6.entity.Referenciel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferencielService {

    @Autowired(required = false)
    private UseDaoImpl<Referenciel> referencielUseDao = new UseDaoImpl<>(Referenciel.class);

    public List<Referenciel> getAll() {
        return referencielUseDao.getAll();
    }

    public Referenciel findOneById(int id)
    {
        return referencielUseDao.findById(id);
    }

}