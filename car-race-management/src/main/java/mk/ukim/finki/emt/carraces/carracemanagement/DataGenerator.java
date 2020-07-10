package mk.ukim.finki.emt.carraces.carracemanagement;

import mk.ukim.finki.emt.carraces.carracemanagement.domain.repository.CarRaceRepository;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator {

    private final CarRaceRepository carRaceRepository;

    DataGenerator(CarRaceRepository carRaceRepository)
    {
        this.carRaceRepository=carRaceRepository;
    }
}
