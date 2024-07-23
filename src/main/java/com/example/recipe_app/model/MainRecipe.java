package com.example.recipe_app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Entity
@Entity
public class MainRecipe {
//    Id = primary key of an entity
//    GeneratedValue = specify the primary key generation strategy

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String preparation;
    private String cooking;

//    Default constructor
    public MainRecipe() {}

//    Getters and setters

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }


}
