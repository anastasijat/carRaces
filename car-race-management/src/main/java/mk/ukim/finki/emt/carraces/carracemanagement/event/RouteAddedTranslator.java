package mk.ukim.finki.emt.carraces.carracemanagement.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainEvent;
import mk.ukim.finki.emt.carraces.sharedkernel.infra.eventlog.RemoteEventTranslator;
import mk.ukim.finki.emt.carraces.sharedkernel.infra.eventlog.StoredDomainEvent;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RouteAddedTranslator implements RemoteEventTranslator {


    private final ObjectMapper objectMapper;

    public RouteAddedTranslator(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(StoredDomainEvent storedDomainEvent) {
        return storedDomainEvent.domainEventClassName().equals("mk.ukim.finki.emt.productordering.ordermanagement.domain.event.OrderItemAdded");
    }

    @Override
    public Optional<DomainEvent> translate(StoredDomainEvent remoteEvent) {
        return Optional.of(remoteEvent.toDomainEvent(objectMapper, RouteAdded.class));
    }
}
