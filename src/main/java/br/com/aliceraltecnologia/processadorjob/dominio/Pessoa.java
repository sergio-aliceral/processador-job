package br.com.aliceraltecnologia.processadorjob.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;

	private String sobrenome;
	
	private Integer idade;

	private String email;
	
	private List<Transacao> transacoes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa{" + "nome='" + nome + "'" + ", idade='" + idade + "'" + ", email='" + email + "'" + (transacoes.isEmpty() ? "" : ", transacoes=" + transacoes) +'}';
	}
}
