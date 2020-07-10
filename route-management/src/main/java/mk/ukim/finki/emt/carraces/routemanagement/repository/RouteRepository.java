package mk.ukim.finki.emt.carraces.routemanagement.repository;

import mk.ukim.finki.emt.carraces.routemanagement.model.Route;
import mk.ukim.finki.emt.carraces.routemanagement.model.RouteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, RouteId> {
}
