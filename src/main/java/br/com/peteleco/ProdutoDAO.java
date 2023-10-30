
package br.com.peteleco;

import javax.persistence.EntityManager;

/**
 *
 * @author 09869114709
 */
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
