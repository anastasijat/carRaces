package mk.ukim.finki.emt.carraces.carracemanagement.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;
import javax.persistence.Embeddable;


@Embeddable
public class CarRaceId extends DomainObjectId {

    private CarRaceId() {
        super(DomainObjectId.randomId(CarRaceId.class).toString());
    }

    @JsonCreator
    public CarRaceId(String id) {
        super(id);
    }

}
