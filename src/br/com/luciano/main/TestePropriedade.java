package br.com.luciano.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.luciano.jpa.JPAUtil;
import br.com.luciano.model.Proprietario;

public class TestePropriedade {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = JPAUtil.createEntityManager().getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		Proprietario proprietario = new Proprietario();
		proprietario.setNome("Antonio Lima");
		proprietario.getTelefones().add("(88)98854-0981");
		proprietario.getTelefones().add("(88)98854-1025");
		proprietario.getTelefones().add("(88)98854-5510");
		
		em.getTransaction().begin();
		em.persist(proprietario);
		em.getTransaction().commit();
		em.close();
	}

}
