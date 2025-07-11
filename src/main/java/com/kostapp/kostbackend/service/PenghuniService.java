package com.kostapp.kostbackend.service;

import com.kostapp.kostbackend.model.Penghuni;
import com.kostapp.kostbackend.repository.PenghuniRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PenghuniService {
    private final PenghuniRepository penghuniRepository;

    public PenghuniService(PenghuniRepository penghuniRepository) {
        this.penghuniRepository = penghuniRepository;
    }

    public List<Penghuni> getAll() {
        return penghuniRepository.findAll();
    }

    public Optional<Penghuni> getById(Integer id) {
        return penghuniRepository.findById(id);
    }

    public Penghuni save(Penghuni penghuni) {
        return penghuniRepository.save(penghuni);
    }

    public void delete(Integer id) {
        penghuniRepository.deleteById(id);
    }
}
