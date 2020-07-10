package mk.ukim.finki.emt.carraces.carracemanagement.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

import static mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId.*;

@Embeddable
public class RouteId extends DomainObjectId {

    private RouteId()
    {
        super(randomId(RouteId.class).toString());
    }

    @JsonCreator
    public RouteId(String id)
    {
        super(id);
    }

}

