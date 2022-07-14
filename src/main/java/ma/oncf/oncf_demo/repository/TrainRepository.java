package ma.oncf.oncf_demo.repository;


import ma.oncf.oncf_demo.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long> {
//    List<Train> findByDateDepart(Date date);
}
