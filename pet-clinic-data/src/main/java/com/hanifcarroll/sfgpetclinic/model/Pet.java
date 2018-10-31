package com.hanifcarroll.sfgpetclinic.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetTye() {
        return petType;
    }

    public void setPetTye(PetType petTye) {
        this.petType = petTye;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
