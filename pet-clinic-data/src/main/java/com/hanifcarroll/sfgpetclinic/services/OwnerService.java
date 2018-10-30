package com.hanifcarroll.sfgpetclinic.services;

import com.hanifcarroll.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
