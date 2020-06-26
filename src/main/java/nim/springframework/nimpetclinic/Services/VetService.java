package nim.springframework.nimpetclinic.Services;

import nim.springframework.nimpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by masoud on 6/26/2020.
 */
public interface VetService {
    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
