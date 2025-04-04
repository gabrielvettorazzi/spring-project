package io.github.cursodsousa.produtosapi.repository;

import io.github.cursodsousa.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
                                                       //ENTIDADE & TIPO ID
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
