package mk.ukim.finki.emt.carraces.routemanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="paths")
@Getter
public class Path extends AbstractEntity<PathId> {


    @Column(name = "path_name", nullable = false)
    private String pathName;

    @Column(name = "path_length", nullable = false)
    private float pathLength;

    @Column(name = "path_elevation", nullable = false)
    private float pathElevation;

    @Column(name = "path_level", nullable = false)
    private int pathLevel;


    private Path() {
    }

    Path(@NonNull String pathName, @NonNull float pathLength, @NonNull float pathElevation, @NonNull int pathLevel) {
        super(DomainObjectId.randomId(PathId.class));
        setPathName(pathName);
        setPathElevation(pathElevation);
        setPathLevel(pathLevel);
        if (pathLength < 0) {
            throw new IllegalArgumentException("Path length cannot be negative");
        }
        this.pathLength = pathLength;
    }


    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public void setPathElevation(float pathElevation) {
        this.pathElevation = pathElevation;
    }

    public void setPathLevel(int pathLevel) {
        this.pathLevel = pathLevel;
    }

    public void setPathLength(int pathLength) {
        if (pathLength < 0.0) {
            throw new IllegalArgumentException("Path length cannot be negative");
        }
        this.pathLength = pathLength;
    }

    @NonNull
    @JsonProperty("path_length")
    public float pathLength() {
        return pathLength;
    }





}
