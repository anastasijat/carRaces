package mk.ukim.finki.emt.carraces.carracemanagement.application;

import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRace;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRaceId;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.repository.CarRaceRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class CarRacesCatalog {
    private final CarRaceRepository carRaceRepository;

    public CarRacesCatalog(CarRaceRepository carRaceRepository)
    {
        this.carRaceRepository=carRaceRepository;
    }

    @NonNull
    public Optional<CarRace> findById(@NonNull CarRaceId carRaceId)
    {
        Objects.requireNonNull(carRaceId,"carRaceId must not be null");
        return carRaceRepository.findById(carRaceId);
    }

    @NonNull
    public List<CarRace> findAll()
    {
        return carRaceRepository.findAll();
    }



}
