package br.com.meuviacep.model.repositories;

import br.com.meuviacep.model.entities.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity,Long> {

    EnderecoEntity findEnderecoByCep(String cep);
}
