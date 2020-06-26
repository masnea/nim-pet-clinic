package nim.springframework.nimpetclinic.Services;

import nim.springframework.nimpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by masoud on 6/26/2020.
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}