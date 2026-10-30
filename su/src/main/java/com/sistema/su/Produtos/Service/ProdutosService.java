
package com.sistema.su.Produtos.Service;

import com.sistema.su.Produtos.Entity.ProdutosEntity;
import com.sistema.su.Produtos.Repository.ProdutosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    private final ProdutosRepository repository;

    public ProdutosService(ProdutosRepository repository) {
        this.repository = repository;
    }

    // LISTAR TODOS OS PRODUTOS
    public List<ProdutosEntity> listarTodos() {
        return repository.findAll();
    }

    // CADASTRAR PRODUTO
    public ProdutosEntity salvarProdutos(ProdutosEntity produtos) {

        if (repository.findByDescricao(produtos.getDescricao()).isPresent()) {
            throw new IllegalArgumentException("Produto já cadastrado");
        }

        return repository.save(produtos);
    }

    // ATUALIZAR PRODUTO
    public ProdutosEntity atualizarProdutos(Long id, ProdutosEntity produtos) {

        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado");
        }

        produtos.setId(id);

        return repository.save(produtos);
    }

    // EXCLUIR PRODUTO
    public void excluirProduto(Long id) {

        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado");
        }

        repository.deleteById(id);
    }
}
