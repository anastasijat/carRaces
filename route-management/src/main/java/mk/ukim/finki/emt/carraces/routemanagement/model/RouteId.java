package mk.ukim.finki.emt.carraces.routemanagement.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@EqualsAndHashCode
public class RouteId extends DomainObjectId {

    private RouteId() {
        super("");
    }

    public RouteId(@NonNull String id) {
        super(id);
    }
}
