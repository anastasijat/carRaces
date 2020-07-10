package mk.ukim.finki.emt.carraces.carracemanagement.domain.repository;


import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRace;
import mk.ukim.finki.emt.carraces.carracemanagement.domain.model.CarRaceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRaceRepository extends JpaRepository<CarRace,CarRaceId>
{

}