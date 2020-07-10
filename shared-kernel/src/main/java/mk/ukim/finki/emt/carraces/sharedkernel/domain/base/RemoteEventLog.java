package mk.ukim.finki.emt.carraces.sharedkernel.domain.base;


import mk.ukim.finki.emt.carraces.sharedkernel.infra.eventlog.StoredDomainEvent;

import java.util.List;

public interface RemoteEventLog {

    List<StoredDomainEvent> events();
}
