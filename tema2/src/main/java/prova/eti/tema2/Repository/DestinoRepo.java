package prova.eti.tema2.Repository;

import prova.eti.tema2.Model.Destino;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepo extends JpaRepository<Long, Destino>{
    
    Destino DeletById(Long id);

    List<Destino> findAll(Long id);

    Destino save();

    Destino findById(Long id);
}
