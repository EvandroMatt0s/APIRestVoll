package API.voll.apiVoll.controller;

import API.voll.apiVoll.medico.DadosCadastroMedico;
import API.voll.apiVoll.medico.DadosListagemMedico;
import API.voll.apiVoll.medico.Medico;
import API.voll.apiVoll.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
    @GetMapping
    public List<DadosListagemMedico>listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
