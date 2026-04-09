package prova.eti.tema2.Repository;

import prova.eti.tema2.Model.Destino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepo extends JpaRepository<Destino, Long>{

    Destino save(Destino destino);

    void DeletById(Long id);

}
