package prova.eti.tema2.Repository;

import prova.eti.tema2.Model.Viagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepo extends JpaRepository<Long, Viagem> {

    Viagem save();

    Viagem findById(Long id);

    Viagem DeletebyId();

}
