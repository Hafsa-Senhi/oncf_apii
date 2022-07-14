package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.StationBus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationBusRepository extends JpaRepository<StationBus,Long> {
}
