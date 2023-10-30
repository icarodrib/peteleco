package br.com.peteleco.produto;

import br.com.peteleco.util.ConnectionFactory;
import javax.persistence.EntityManager;


public class ExemploInsert {
    
    public static void main(String[] args) {
        
        EntityManager em = ConnectionFactory.getEntityManager();
        Produto p1 = new Produto("Iphone 14", "Smartphone", 3500);
        ProdutoDAO dao = new ProdutoDAO(em);
        
        em.getTransaction().begin();
        dao.cadastrar(p1);
        em.getTransaction().commit();
        
        em.close();
        
    }
}
