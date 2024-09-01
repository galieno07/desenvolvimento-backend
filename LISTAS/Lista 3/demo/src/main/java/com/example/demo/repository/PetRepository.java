package com.example.demo.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {
    private static final int REGRESSO = 0;
    private File arquivo = new File("src/main/resoursces/database/tb_pets.json");
    private ObjectMapper ObjectMapper = new ObjectMapper();

    public List<Pet> getAll() throws Exception {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<Pet> pets = null;
        if (arquivo.length() > REGRESSO) {
            pets = ObjectMapper.readValue(arquivo,
                    new TypeReference<ArrayList<Pet>>() {
                    });
        } else {
            pets = new ArrayList<>();
        }

        return pets;
    }

    public boolean save(Pet Pet) throws Exception{
        List<Pet> pets = this.getAll();

        for(Pet petsNoBanco : pets ){
            if(petsNoBanco.getId() == Pet.getId()){
                return false;
            }

        }
        pets.add(Pet);
        return true;
    }

}
