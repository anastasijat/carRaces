package mk.ukim.finki.emt.carraces.sharedkernel.infra.eventlog;


import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainEvent;

import java.util.Optional;

public interface RemoteEventTranslator {

    boolean supports(StoredDomainEvent storedDomainEvent);

    Optional<DomainEvent> translate(StoredDomainEvent remoteEvent);
}
