package com.kostapp.kostbackend.controller;

import com.kostapp.kostbackend.model.Penghuni;
import com.kostapp.kostbackend.service.PenghuniService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/penghuni")
@CrossOrigin
public class PenghuniController {
    private final PenghuniService penghuniService;

    public PenghuniController(PenghuniService penghuniService) {
        this.penghuniService = penghuniService;
    }

    @GetMapping
    public List<Penghuni> getAll() {
        return penghuniService.getAll();
    }

    @GetMapping("/{id}")
    public Penghuni getById(@PathVariable Integer id) {
        return penghuniService.getById(id).orElse(null);
    }

    @PostMapping
    public Penghuni create(@RequestBody Penghuni penghuni) {
        return penghuniService.save(penghuni);
    }

    @PutMapping("/{id}")
    public Penghuni update(@PathVariable Integer id, @RequestBody Penghuni penghuni) {
        penghuni.setIdPenghuni(id);
        return penghuniService.save(penghuni);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        penghuniService.delete(id);
        return ResponseEntity.ok("Data berhasil dihapus");
    }
}
