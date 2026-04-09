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
        return viagemRepo.save();
    }

    public Viagem Consultar(Long id){
        return viagemRepo.findById(id);
    }
    
    public List<Long> Listar(Long id){
        return viagemRepo.findAll();
    }

    public Viagem Deletar(){
        return viagemRepo.DeletebyId();
    }

}

