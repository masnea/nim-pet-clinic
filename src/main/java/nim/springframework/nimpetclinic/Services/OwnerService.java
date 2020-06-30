package nim.springframework.nimpetclinic.Services;

import nim.springframework.nimpetclinic.model.Owner;


/**
 * Created by masoud on 6/26/2020.
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
