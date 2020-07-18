package nim.springframework.nimpetclinic.Services.map;

import nim.springframework.nimpetclinic.Services.OwnerService;
import nim.springframework.nimpetclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by masoud on 6/30/2020.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
