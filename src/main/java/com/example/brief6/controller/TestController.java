package com.example.brief6.controller;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class TestController {

    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        Gson gson = new Gson();

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "ilyas");
        map.put("age", 29);
        map.put("status", true);

        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "ayoub");
        map1.put("age", 25);
        map1.put("status", true);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "amine");
        map2.put("age", 22);
        map2.put("status", true);

        List<Object> list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);

        return ResponseEntity.ok().body(gson.toJson(list));
    }
}