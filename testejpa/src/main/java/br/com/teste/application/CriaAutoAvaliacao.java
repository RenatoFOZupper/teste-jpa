package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.domain.AutoAvaliacao;
import br.com.teste.domain.Resposta;

public class CriaAutoAvaliacao {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();

		
		Resposta resposta = new Resposta();
		resposta.setId(2L);
		
		
		AutoAvaliacao autoAvaliacao = new AutoAvaliacao();
		autoAvaliacao.setNota(10);
		autoAvaliacao.setResposta(resposta);
	
		
		
		em.getTransaction().begin();
		em.persist(autoAvaliacao);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

	}

}
