package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.domain.Aluno;

public class CriaAluno {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana Maria");
		aluno.setEmail("ana.maria@gmail.com");
		aluno.setIdade(27);
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

	}

}
