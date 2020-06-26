package nim.springframework.nimpetclinic.model;

import java.io.Serializable;

/**
 * Created by masoud on 6/26/2020.
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
