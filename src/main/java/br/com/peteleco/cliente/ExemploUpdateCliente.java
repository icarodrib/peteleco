package br.com.peteleco.cliente;

import br.com.peteleco.util.ConnectionFactory;
import javax.persistence.EntityManager;


public class ExemploUpdateCliente {
    
    public static void main(String[] args) {
        
        EntityManager em = ConnectionFactory.getEntityManager();
        Cliente cli = new Cliente();
        cli.setCodigo(1);
        cli.setNome("Maria Clara");
        cli.setCpf("12398745600");
        cli.setEndereco("Rua Carlos alcantará");
        cli.setTelefone(920204444);
        
        
        ClienteDAO dao = new ClienteDAO(em);  
        
        em.getTransaction().begin();
        dao.alterar(cli);
        em.getTransaction().commit();
        
        em.close();
        
    }
}
