package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.StationTram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationTramRepository extends JpaRepository<StationTram,Long> {
}
