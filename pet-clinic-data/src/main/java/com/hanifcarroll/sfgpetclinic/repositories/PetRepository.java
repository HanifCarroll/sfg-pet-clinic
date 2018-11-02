package com.hanifcarroll.sfgpetclinic.repositories;

import com.hanifcarroll.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
