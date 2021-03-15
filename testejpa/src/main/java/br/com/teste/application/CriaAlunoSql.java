package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CriaAlunoSql {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNativeQuery("INSERT INTO aluno (nome, email, idade) VALUES (:nome, :email, :idade);");
		
		
		query.setParameter("nome", "Manoel de Paiva");
		query.setParameter("email", "manoel.paiva@gmail.com");
		query.setParameter("idade", 63);
		
		em.getTransaction().begin();
		query.executeUpdate();
		em.getTransaction().commit();

	}

}
