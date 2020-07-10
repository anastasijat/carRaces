package mk.ukim.finki.emt.carraces.carracemanagement.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vaadin.flow.server.PwaIcon;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRaceId;
import mk.ukim.finki.emt.carraces.routemanagement.model.Route;
import mk.ukim.finki.emt.carraces.routemanagement.model.RouteId;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainEvent;

import java.time.Instant;

public class RouteAdded implements DomainEvent {


    private final RouteId routeId;

    @JsonProperty ("carRace_id")
    private final CarRaceId carRaceId;

    @JsonProperty("occurredOn")
    private final Instant occurredOn;

    public RouteAdded(RouteId routeId, CarRaceId carRaceId,Instant occurredOn)
    {
        this.routeId=routeId;
        this.carRaceId=carRaceId;
        this.occurredOn=occurredOn;
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}
