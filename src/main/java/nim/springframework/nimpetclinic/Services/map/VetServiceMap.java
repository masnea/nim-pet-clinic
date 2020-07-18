package nim.springframework.nimpetclinic.Services.map;

import nim.springframework.nimpetclinic.Services.VetService;
import nim.springframework.nimpetclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by masoud on 6/30/2020.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
