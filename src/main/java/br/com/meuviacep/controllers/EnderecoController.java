package br.com.meuviacep.controllers;

import br.com.meuviacep.model.entities.EnderecoEntity;
import br.com.meuviacep.model.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    /**
     * @author Joao Marcos Santos
     * Method that return printable json with cep as parameter
     *
     * HTTP Status
     * 200 - Ok.
     * 400 - Cep not Found
     */

    @GetMapping(value = "/{cep}")
    public ResponseEntity<EnderecoEntity> findByCep(@PathVariable String cep){
        EnderecoEntity endereco = enderecoService.findCep(cep);
        if (endereco.getCep() == null) {
            return ResponseEntity.notFound().build();
        }
            return ResponseEntity.ok().body(endereco);
    }
}
