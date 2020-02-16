package com.algaworks.socialbooks.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Livro {

	@JsonInclude(Include.NON_NULL)
	private Long id;

	private String nome;

	@JsonInclude(Include.NON_NULL)
	private Date publicado;

	@JsonInclude(Include.NON_NULL)
	private String editora;

	@JsonInclude(Include.NON_NULL)
	private String resumo;

	@JsonInclude(Include.NON_NULL)
	private List<Comentario> comnetarios;

	@JsonInclude(Include.NON_NULL)
	private String autor;
	
	public Livro() {
		
	}
	
	public Livro(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getPublicado() {
		return publicado;
	}

	public void setPublicado(Date publicado) {
		this.publicado = publicado;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public List<Comentario> getComnetarios() {
		return comnetarios;
	}

	public void setComnetarios(List<Comentario> comnetarios) {
		this.comnetarios = comnetarios;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
