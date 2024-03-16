package com.br.listenall.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/listaAtiva")
class controller {

    @GetMapping("/list")
    public ResponseEntity<String> listaAtiva(){
        return ResponseEntity.ok("listaAtiva");
    }

}