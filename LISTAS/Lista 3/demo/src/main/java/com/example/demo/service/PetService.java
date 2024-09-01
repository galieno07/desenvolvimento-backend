package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;



public class PetService {
    private PetRepository repository = new PetRepository();
public List<Pet> listarTodosOsPets() throws Exception{
    return repository.getAll();
}

    
public String cadastrarNovoPet(Pet pet){
       if(Repository.save(pet)){
            return "Pet" + pet.getId() + "foi cadastrado com sucesso";
        }
        return "Pets devem ter ids únicos";
    }

}
