package com.example.books.repository;

import com.example.books.model.It;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "itRepo")
public class ItRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String TABLE = "it";

    public List<It> getAll() {
        return jdbcTemplate.query("SELECT * FROM " + TABLE + ";",
                (rs, rowNum) -> new It(
                        rs.getLong("id"),
                        rs.getString("author"),
                        rs.getString("name"),
                        rs.getBigDecimal("price")
                )
        );
    }

}
