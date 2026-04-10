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
import prova.eti.tema2.Model.Destino;
import prova.eti.tema2.Service.DestinoService;


@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/")
public class DestinoController {
     
    private final DestinoService destinoService;

    @PostMapping
    public Destino CriarDestino(@RequestBody Destino destino){
        return destinoService.Criar(destino);
    }

    @GetMapping
    public List<Destino> ListarDestino(){
        return destinoService.listar();
    }

    @PutMapping
    public Destino AtualizarDestino(@PathVariable Long id, @RequestBody Destino destino){
        return destinoService.Atualizar(destino);
    }

    @DeleteMapping("api/{id}")
    public void DeletarDestino(@PathVariable Long id){
        destinoService.Deletar(id);
    }
}
