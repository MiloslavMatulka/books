package com.example.books.service;

import com.example.books.mapper.ItMapper;
import com.example.books.model.dto.ItDTO;
import com.example.books.repository.ItRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "itServiceImpl")
public class ItServiceImpl implements ItService {

    @Autowired
    private ItMapper itMapper;

    @Autowired
    private ItRepository itRepo;

    @Override
    public List<ItDTO> getAll() {
        return itRepo.getAll()
                .stream()
                .map(e -> itMapper.toItDto(e))
                .toList();
    }

}
