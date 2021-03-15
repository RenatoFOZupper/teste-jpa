package br.com.teste.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.teste.domain.Resposta;

public class BuscaRespostasPeloObjetoAluno {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();

		TypedQuery<Resposta> query = em.createQuery("SELECT r FROM Resposta r JOIN r.aluno a WHERE a.id = 1",
				Resposta.class);
		List<Resposta> results = query.getResultList();
		for (Resposta resposta : results) {
			System.out.println("Id do aluno: " + resposta.getAluno().getId());
			System.out.println("Nome do aluno: " + resposta.getAluno().getNome());
			System.out.println("Respostas do aluno: " + resposta.getResposta());
		}
	}

}
