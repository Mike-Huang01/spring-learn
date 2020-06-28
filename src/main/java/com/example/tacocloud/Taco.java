package com.example.tacocloud;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min=5, message="至少5个字符")
    private String name;

    private List<Ingredient> ingredients;
}
