package mk.ukim.finki.emt.carraces.routemanagement.model;

import javax.persistence.Embeddable;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class PathId extends DomainObjectId {

    private String id;

    private PathId() {
        super("");
    }

    public PathId(String uuid) {
        super(uuid);
        this.id=uuid;
    }

}
