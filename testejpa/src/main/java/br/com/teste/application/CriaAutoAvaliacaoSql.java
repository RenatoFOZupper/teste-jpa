package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CriaAutoAvaliacaoSql {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNativeQuery("INSERT INTO autoavaliacao (nota, resposta_id) VALUES (:nota, :resposta_id);");
		
		em.getTransaction().begin();
		query.setParameter("nota", 10);
		query.setParameter("resposta_id", 2L);
		query.executeUpdate();
		em.getTransaction().commit();

	}

}
