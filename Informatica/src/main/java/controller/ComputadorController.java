package controller;

import biz.ComputadorBiz;
import entity.Computador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ComputadorRepository;
import repositories.Mensagem;

import javax.validation.ConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping("computador")
@CrossOrigin

public class ComputadorController {

    @Autowired
    private ComputadorRepository computadorRepository;

    @GetMapping("listar")
    public List<Computador> listar(){
        List <Computador> lista = computadorRepository.findAll();
        return lista;
    }

    @PostMapping("incluir")
    public Mensagem incluir(@RequestBody Computador computador){
        computador.setIdComputador(0);
        return salvar(computador);
    }

    @PostMapping("alterar")
    public Mensagem alterar(@RequestBody Computador computador){
        return salvar(computador);
    }

    @GetMapping("/{id}")
    public Computador consultar(@PathVariable Integer id){
        return computadorRepository.findById(id).get();
    }

    public Mensagem salvar(Computador computador){
        ComputadorBiz computadorBiz = new ComputadorBiz();

        try{
            if(computadorBiz.Validade(computador)){
                this.computadorRepository.save(computador);
                this.computadorRepository.flush();
            }else{
                return computadorBiz.msg;
            }
        }catch (ConstraintViolationException e){
            e.getConstraintViolations().forEach(v -> computadorBiz.msg.mensagens.add(v.getMessage()));
            return computadorBiz.msg;
        }
        computadorBiz.msg.mensagens.add("OK");
        return computadorBiz.msg;
    }
}

