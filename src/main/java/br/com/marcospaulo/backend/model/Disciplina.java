package br.com.marcospaulo.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "disciplinas")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dis_id")
	private long id;

	@Column(name = "dis_nome", length = 100, nullable = false)
	private String nome;

	@ManyToOne
	private Turma turma;

	public Disciplina() {
	}

	public Disciplina(Long id, String nome, Turma turma) {
		this.id = id;
		this.nome = nome;
		this.turma = turma;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}