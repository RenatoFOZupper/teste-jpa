package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CriaAvaliacaoSql {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNativeQuery("INSERT INTO avaliacao (titulo, descricao) VALUES (:titulo, :descricao);");
		
		em.getTransaction().begin();
		query.setParameter("titulo", "Primeiro Titulo");
		query.setParameter("descricao", "Primeira descricao");
		query.executeUpdate();
		em.getTransaction().commit();

	}

}
