package com.initprojects.controller;

import com.initprojects.entity.Kullanici;
import com.initprojects.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
@Autowired
private KullaniciRepository kullaniciRepository;
    @PostConstruct
    public void init()
    {
        Kullanici kullanici = new Kullanici();
        kullanici.setAdi("Ab");
        kullanici.setSoyadi("y");
        kullaniciRepository.save(kullanici);
    }

    @PostMapping
    public ResponseEntity<Kullanici> Ekle(@RequestBody Kullanici kullanici)
    {
           return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> TumunuListele()
    {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
