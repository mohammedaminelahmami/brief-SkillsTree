package com.example.brief6.controller;

import com.example.brief6.entity.Apprenant;
import com.example.brief6.service.ApprenantService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;

    @GetMapping(value = "/getAllApprenant", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllApprenant() {
        Gson gson = new Gson();
        List<Apprenant> apprenants = apprenantService.listApprenant();
        return ResponseEntity.ok(gson.toJson(apprenants));
    }
}