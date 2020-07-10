package mk.ukim.finki.emt.carraces.carracemanagement.domain.model;

import lombok.Getter;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.City;
import mk.ukim.finki.emt.carraces.sharedkernel.domain.base.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.security.PublicKey;

@Entity
@Table(name="carRace")
public class CarRace extends AbstractEntity<CarRaceId> {

    @Version
    private Long version;

    @Column(name = "name", nullable = false)
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cityName", column = @Column(name="cityName"))
    })
    private City city;

    public CarRace() {

    }

    public CarRace(CarRaceId carRaceId,String name,City city)
    {
        super(carRaceId);
        this.name=name;
        this.city=city;
    }

    public CarRace(String name,City city)
    {
        this.name=name;
        this.city=city;
    }

    @JsonProperty("name")
    public String getName()
    {
        return name;
    }

    public City getCity()
    {
        return city;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void setCity(City city)
    {
        this.city=city;
    }

    public String toString()
    {
        return name.toString();
    }









}
