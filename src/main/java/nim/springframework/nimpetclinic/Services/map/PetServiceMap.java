package nim.springframework.nimpetclinic.Services.map;

import nim.springframework.nimpetclinic.Services.CrudService;
import nim.springframework.nimpetclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by masoud on 6/30/2020.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save( Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

}
