package med.voll.api.controller;

import med.voll.api.paciente.DadosPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(DadosPaciente dados){
        System.out.println(dados);
    }
}
