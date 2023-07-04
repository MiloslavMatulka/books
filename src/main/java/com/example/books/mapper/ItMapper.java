package com.example.books.mapper;

import com.example.books.model.It;
import com.example.books.model.dto.ItDTO;

import org.springframework.stereotype.Service;

@Service(value = "itMapper")
public class ItMapper {

    public ItDTO toItDto(It it) {
        return new ItDTO(it.getAuthor(), it.getName());
    }

}
