package br.com.luciano.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
		
		private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Crud_jpa_hibernatePU");

		public static EntityManager createEntityManager() {
			return emf.createEntityManager();
		}

}
