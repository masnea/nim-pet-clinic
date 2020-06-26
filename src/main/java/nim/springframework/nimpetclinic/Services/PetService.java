package nim.springframework.nimpetclinic.Services;

import nim.springframework.nimpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by masoud on 6/26/2020.
 */
public interface PetService  {
    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
