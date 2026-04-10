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

    public Destino Criar(Destino destino){
        return destinoRepo.save(destino);
    }

    // lista todos pelo Id
    public List<Destino> listar(){
        return destinoRepo.findAll();
    }

    public Destino Atualizar(Destino destino){
        return destinoRepo.save(destino);
    }

    public void Deletar(Long id){
        destinoRepo.deleteById(id);
    }

}
