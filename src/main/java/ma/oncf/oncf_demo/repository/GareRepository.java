package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.Gare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends JpaRepository<Gare,Long> {
    //Gare finByName(String name);

}
