package AvaliacaoFormativaMarco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import AvaliacaoFormativaMarco.Entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
