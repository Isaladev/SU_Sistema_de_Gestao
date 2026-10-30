package com.sistema.su.Produtos.Repository;

import com.sistema.su.Produtos.Entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutosRepository extends JpaRepository<ProdutosEntity, Long> {
    Optional<ProdutosEntity> findByDescricao(String descricao);

}
