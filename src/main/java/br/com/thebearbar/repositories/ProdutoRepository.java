package br.com.thebearbar.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.thebearbar.entities.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Optional<Produto> findByNome(String nome);


}