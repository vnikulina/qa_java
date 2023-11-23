package com.example;

import java.util.List;

import static com.example.constants.AnimalFood.*;
import static com.example.constants.AnimalKinds.*;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (HERBIVORUS.equals(animalKind)) {
            return HERB_FOOD;
        } else if (PREDATOR.equals(animalKind)) {
            return MEET_FOOD;
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение "+HERBIVORUS+" или "+PREDATOR);
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}