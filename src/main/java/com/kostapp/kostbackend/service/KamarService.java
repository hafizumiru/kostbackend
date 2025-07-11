package com.kostapp.kostbackend.service;

import com.kostapp.kostbackend.model.Kamar;
import com.kostapp.kostbackend.repository.KamarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KamarService {
    private final KamarRepository kamarRepository;

    public KamarService(KamarRepository kamarRepository) {
        this.kamarRepository = kamarRepository;
    }

    public List<Kamar> getAll() {
        return kamarRepository.findAll();
    }

    public Optional<Kamar> getById(Integer id) {
        return kamarRepository.findById(id);
    }

}
