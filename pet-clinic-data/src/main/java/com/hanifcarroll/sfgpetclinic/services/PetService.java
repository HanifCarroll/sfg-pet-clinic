package com.hanifcarroll.sfgpetclinic.services;

import com.hanifcarroll.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
