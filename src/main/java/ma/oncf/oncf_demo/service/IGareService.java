package ma.oncf.oncf_demo.service;



import ma.oncf.oncf_demo.model.Gare;

import java.util.List;

public interface IGareService{

     Gare findByCode(Long code);
     Gare findByName(String name);
     List<Gare> findAll();

     List<Gare> save(Gare gare);
}
