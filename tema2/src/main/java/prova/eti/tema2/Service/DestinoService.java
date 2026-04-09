package prova.eti.tema2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import prova.eti.tema2.Model.Destino;
import prova.eti.tema2.Repository.DestinoRepo;

@Service
@AllArgsConstructor
public class DestinoService {
    
    private final DestinoRepo destinoRepo;

    public Destino salvar(Destino destino){
        return destinoRepo.save();
    }

    // Lista apenas um destino
    public Destino Consultar(Long id){
        return destinoRepo.findById(id);
    }

    // lista todos pelo Id
    public List<Destino> listar(Long id){
        return destinoRepo.findAll(id);
    }

    // deleta pelo id
    public Destino Deletar(Long id){
        return destinoRepo.DeletById(id);
    }

}
