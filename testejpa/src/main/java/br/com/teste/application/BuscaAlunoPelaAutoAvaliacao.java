package br.com.teste.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.teste.domain.AutoAvaliacao;

public class BuscaAlunoPelaAutoAvaliacao {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup");
		EntityManager em = emf.createEntityManager();

		TypedQuery<AutoAvaliacao> query = em
				.createQuery("SELECT a FROM AutoAvaliacao a JOIN a.resposta r WHERE a.id = 3", AutoAvaliacao.class);
		List<AutoAvaliacao> results = query.getResultList();
		for (AutoAvaliacao autoAvaliacao : results) {
			System.out.println("Id da auto avaliação: " + autoAvaliacao.getId());
			System.out.println("Id do aluno: " + autoAvaliacao.getResposta().getAluno().getId());
			System.out.println("Nome do aluno: " + autoAvaliacao.getResposta().getAluno().getNome());
		}
	}

}
