package mk.ukim.finki.emt.carraces.routemanagement.model;

import lombok.Getter;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.City;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

@Entity
@Table(name = "routes")
@Getter
public class Route extends AbstractEntity<RouteId> {

    @Version
    private Long version;

    @Column(name = "route_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private String routeName;

    @Column(name = "city", nullable = false)
    @Enumerated(EnumType.STRING)
    private City city;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Path> paths;

    private Route() {

    }

    public Route(@NonNull String routeName, @NonNull City city) {
        super(DomainObjectId.randomId(RouteId.class));
        this.paths = new HashSet<>();
        setRouteName(routeName);
        setCity(city);

    }


    public void setRouteName(String routeName)
    {
        this.routeName = routeName;
    }

    public void setCity(City city)
    {
        this.city = city;
    }


    public Stream<Path> getPaths() {
        return paths.stream();
    }


    public Path addPath(@NonNull Path path) {
        Objects.requireNonNull(path,"path must not be null");
        paths.add(path);
        return path;
    }




}