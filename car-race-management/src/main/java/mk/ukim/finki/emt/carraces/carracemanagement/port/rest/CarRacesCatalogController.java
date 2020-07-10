package mk.ukim.finki.emt.carraces.carracemanagement.port.rest;

import mk.ukim.finki.emt.carraces.carracemanagement.application.CarRacesCatalog;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRace;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRaceId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carRaces")
public class CarRacesCatalogController {

    private final CarRacesCatalog carRacesCatalog;

    CarRacesCatalogController(CarRacesCatalog carRacesCatalog)
    {
        this.carRacesCatalog=carRacesCatalog;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarRace> findById(@PathVariable("id") String id)
    {
        return carRacesCatalog.findById(new CarRaceId(id)).map(
                ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<CarRace> findAll(){
        return carRacesCatalog.findAll();
    }

}
