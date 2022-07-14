package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository extends JpaRepository<Ville,Long> {
}
