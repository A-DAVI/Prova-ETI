package prova.eti.tema2.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import prova.eti.tema2.Model.Viagem;
import prova.eti.tema2.Service.ViagemService;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("api/")
public class ViagemController {
    
    private ViagemService viagemService;

    @PostMapping
    public Viagem CriarViagem(@RequestBody Viagem viagem){
        return viagemService.Criar(viagem);
    }

    @GetMapping
    public List<Viagem> ListarViagem(){
        return viagemService.Listar();
    }

    @PutMapping
    public Viagem AtualizarViagem(@PathVariable Long id, @RequestBody Viagem viagem){
        return viagemService.Atualizar(viagem);
    }

    @DeleteMapping("api/{id}")
    public void DeletarViagem(@PathVariable Long id){
        viagemService.Deletar(id);
    }
}
