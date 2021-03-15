package br.com.teste.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.domain.Aluno;
import br.com.teste.domain.Avaliacao;
import br.com.teste.domain.Resposta;

public class CriaResposta {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setId(2L);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setId(3L);
		
		Resposta resposta = new Resposta();
		resposta.setResposta("Resposta da avaliacao 3");
		
		resposta.setAluno(aluno);
		resposta.setAvaliacao(avaliacao);
		
		
		em.getTransaction().begin();
		em.persist(resposta);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		

	}

}
