package br.com.peteleco.cliente;


import br.com.peteleco.util.ConnectionFactory;
import javax.persistence.EntityManager;


public class ExemploInsertCliente {
    
    public static void main(String[] args) {
        
        EntityManager em = ConnectionFactory.getEntityManager();
        Cliente cli;
        cli = new Cliente("Lucas", "12345678900","Avenida Paulo de Frontin",912345678);
        ClienteDAO dao = new ClienteDAO(em);
        
        em.getTransaction().begin();
        dao.cadastrar(cli);
        em.getTransaction().commit();
        
        em.close();
        
    }
}
