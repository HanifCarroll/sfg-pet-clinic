package com.hanifcarroll.sfgpetclinic.repositories;

import com.hanifcarroll.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
