package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.StationTaxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationTaxiRepository extends JpaRepository<StationTaxi,Long> {
}
