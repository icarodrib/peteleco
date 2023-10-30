
package br.com.peteleco.produto;

import javax.persistence.EntityManager;


public class ProdutoDAO {
    private EntityManager em;
    
    public ProdutoDAO(EntityManager em){
        this.em = em;
    }
    
    public void cadastrar(Produto produto){
        em.persist(produto);
    }
    
    public void alterar(Produto produto){
        em.merge(produto);
    }
}
