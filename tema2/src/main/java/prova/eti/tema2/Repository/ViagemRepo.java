package prova.eti.tema2.Repository;

import prova.eti.tema2.Model.Viagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViagemRepo extends JpaRepository<Viagem, Long> {

    Viagem save(Viagem viagem);

    Viagem DeletebyId(Long id);

}
