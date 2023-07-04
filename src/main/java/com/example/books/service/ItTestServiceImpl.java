package com.example.books.service;

import com.example.books.model.It;
import com.example.books.repository.ItRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "itTestServiceImpl")
public class ItTestServiceImpl implements ItTestService {

    @Autowired
    private ItRepository itRepo;

    @Override
    public List<It> getAll() {
        return itRepo.getAll();
    }

}
