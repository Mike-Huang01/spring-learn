package com.example.tacocloud.web;

import com.example.tacocloud.Ingredient;
import com.example.tacocloud.data.IngredientRepository;
import com.example.tacocloud.data.JdbcIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
    public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private JdbcIngredientRepository jdbcIngredientRepo;

    @Autowired
    public IngredientByIdConverter(JdbcIngredientRepository jdbcIngredientRepo) {
        this.jdbcIngredientRepo = jdbcIngredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return jdbcIngredientRepo.findOne(id);
    }

}