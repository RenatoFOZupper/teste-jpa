package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CriaRespostaSql {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNativeQuery("INSERT INTO resposta (resposta, aluno_id, avaliacao_id) VALUES (:resposta, :aluno_id, :avaliacao_id);");
		
		em.getTransaction().begin();
		query.setParameter("resposta", "Segunda resposta");
		query.setParameter("aluno_id", 1L);
		query.setParameter("avaliacao_id", 1L);
		query.executeUpdate();
		em.getTransaction().commit();

	}

}
