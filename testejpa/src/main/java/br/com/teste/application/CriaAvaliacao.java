package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.domain.Avaliacao;

public class CriaAvaliacao {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setTitulo("Terceira Avaliacao");
		avaliacao.setDescricao("KAKAKAKA");
		
		
		em.getTransaction().begin();
		em.persist(avaliacao);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

	}

}
