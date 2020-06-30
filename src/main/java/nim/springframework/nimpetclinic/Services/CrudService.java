package nim.springframework.nimpetclinic.Services;

import java.util.Set;

/**
 * Created by masoud on 6/30/2020.
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
