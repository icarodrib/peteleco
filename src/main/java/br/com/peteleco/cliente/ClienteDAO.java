
package br.com.peteleco.cliente;

import javax.persistence.EntityManager;


public class ClienteDAO {
    private EntityManager em;
    
    public ClienteDAO(EntityManager em){
        this.em = em;
    }
    
    public void cadastrar(Cliente cliente){
        em.persist(cliente);
    }
    
    public void alterar(Cliente cliente){
        em.merge(cliente);
    }
}
