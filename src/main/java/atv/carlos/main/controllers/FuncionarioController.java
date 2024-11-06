package atv.carlos.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import atv.carlos.main.models.Funcionario;
import atv.carlos.main.repositories.FuncionarioRepository;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return ResponseEntity.ok("Funcionário inserido com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity <List<Funcionario>> listFuncionarios() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        return ResponseEntity.ok(funcionarios);
    }
}
