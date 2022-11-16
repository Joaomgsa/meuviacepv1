package br.com.meuviacep.model.services;

import br.com.meuviacep.model.entities.EnderecoEntity;
import br.com.meuviacep.model.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public EnderecoEntity findCep(String cep){

        String url = "https://viacep.com.br/ws/"+cep+"/json/";

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        EnderecoEntity endereco = restTemplate.getForObject(url, EnderecoEntity.class);


        return endereco;
    }

    public void save (EnderecoEntity enderecoEntity){
        EnderecoEntity endererecoEncontrado = enderecoRepository.findEnderecoByCep(enderecoEntity.getCep());
        if(endererecoEncontrado == null){
            enderecoRepository.save(enderecoEntity);
        }
        else {
            update(endererecoEncontrado,enderecoEntity);
        }
    }

    public void update(EnderecoEntity enderecoEncontrado, EnderecoEntity enderecoEntityJson){
        enderecoEncontrado.update(enderecoEntityJson);
        enderecoRepository.save(enderecoEncontrado);
    }
}
