package br.com.marcospaulo.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "pessoas")
public class Pessoa {

	/* Atributos */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="pes_id")
	private long id;
	
	@Column(name="pes_nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="pes_idade", nullable = false)
	private int idade;

	/* Métodos */
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
