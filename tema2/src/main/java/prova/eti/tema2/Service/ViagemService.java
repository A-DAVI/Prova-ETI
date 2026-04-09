package prova.eti.tema2.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import prova.eti.tema2.Model.Viagem;
import prova.eti.tema2.Repository.ViagemRepo;

@Service
@AllArgsConstructor
public class ViagemService {
    
    private final ViagemRepo viagemRepo;

    public Viagem Criar(Viagem viagem){
        return viagemRepo.save(viagem);
    }
    
    public List<Viagem> Listar(){
        return viagemRepo.findAll();
    }

    public Viagem Atualizar(Viagem viagem){
        return viagemRepo.save(viagem);
    }

    public Viagem Deletar(Long id){
        return viagemRepo.DeletebyId(id);
    }

}

