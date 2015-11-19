package br.com.digitala.banco;

// Generated 04/06/2015 11:21:49 by Hibernate Tools 3.4.0.CR1

/**
 * Empresa generated by hbm2java
 */
public class Empresa implements java.io.Serializable {

	private Integer idEmpresa;
	private String nome;
	private String cnpj;
	private String email;
	private String telefone;
	private String contato;
	private String endereco;

	public Empresa() {
	}

	public Empresa(String nome) {
		this.nome = nome;
	}

	public Empresa(String nome, String cnpj, String email, String telefone, String contato, String endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.contato = contato;
		this.endereco = endereco;
	}

	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getContato() {
		return this.contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}