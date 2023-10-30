package br.com.peteleco.produto;

import br.com.peteleco.util.ConnectionFactory;
import java.time.LocalDate;
import javax.persistence.EntityManager;


public class ExemploUpdate {
    
    public static void main(String[] args) {
        
        EntityManager em = ConnectionFactory.getEntityManager();
        Produto p1 = new Produto();
        p1.setCodigo(3);
        p1.setNome("Galaxy Note 7");
        p1.setDescricao("Smartphone");
        p1.setCadastro(LocalDate.of(2015, 4, 22));
        p1.setPreco(2000);
        
        
        ProdutoDAO dao = new ProdutoDAO(em);  
        
        em.getTransaction().begin();
        dao.alterar(p1);
        em.getTransaction().commit();
        
        em.close();
        
    }
}
