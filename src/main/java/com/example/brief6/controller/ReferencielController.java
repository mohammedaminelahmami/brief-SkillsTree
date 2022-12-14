package com.example.brief6.controller;

import com.example.brief6.entity.Competence;
import com.example.brief6.entity.Referenciel;
import com.example.brief6.service.ReferencielService;
import com.example.brief6.util.SoutError;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/referenciel")
@CrossOrigin(origins = "*")
public class ReferencielController {
    @Autowired
    private ReferencielService referencielService;

    @GetMapping(value = "/getAllReferenciels", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllReferenciels() {
        Gson gson = new Gson();
       // List<Referenciel> referenciels = referencielService.getAll();
        Referenciel r2 = referencielService.findOneById(1);
        List<Competence> c1 = r2.getCompetences();
        String result = r2.getName();
        SoutError.print("orange", r2.getName());
        System.out.println(r2.getCompetences());
       /* for(Referenciel ref: referenciels)
        {
            System.out.println(ref.toString());
        }*/

       // int result = referenciels.size();
        return ResponseEntity.ok(gson.toJson(c1));
    }
}