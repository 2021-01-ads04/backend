package br.com.marcospaulo.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "turmas")
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tur_id")
	private long id;
	
	@Column(name="tur_nome",length = 100, nullable = false)
	private String nome;
	
	@ManyToOne
	private Curso curso;
	
	public Turma() {}

    public Turma(Long id, String nome, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;

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
		
		if (nome == null) {
			throw new Exception("Turma inválida.");
		}
		if (nome.isEmpty() || nome.length() < 5) {
			throw new Exception("Turma inválida.");
		}
		
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}