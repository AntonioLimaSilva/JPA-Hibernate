package br.com.luciano.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import br.com.luciano.jpa.JPAUtil;
import br.com.luciano.model.Cliente;

public class TesteDoCicloDeVida {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = JPAUtil.createEntityManager().getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Antonio");
		cliente.setIdade(26);
		cliente.setProfissao("Programador java");
		cliente.setSexo("M");
		
		try {
			em.getTransaction().begin();
			cliente.setIdade(30);
			//em.detach(cliente);
			em.persist(cliente);
			em.getTransaction().commit();
		} catch(PersistenceException e) {
			System.err.println("Erro ao persistir entidade. " + e.getMessage());
			em.getTransaction().rollback();
		}
		
		em.close();
	}

}
