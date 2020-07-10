package mk.ukim.finki.emt.carraces.carracemanagement.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

import static mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId.*;

@Embeddable
public class PathId extends DomainObjectId {

    private String id;

    private PathId() {
        super(randomId(PathId.class).toString());
    }

    @JsonCreator
    public PathId(String uuid) {
        super(uuid);
        this.id=uuid;
    }
}
