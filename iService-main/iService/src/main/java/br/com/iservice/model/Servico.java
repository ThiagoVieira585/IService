package br.com.iservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String servico;
	private String classificacaoDoServico;
	private String descriçãoDoServico;
	private String rua;
	private String bairro;
	private String cidade;
	private int numero;
	private String cep;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	private int avaliacao;
	private int concluidos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public String getClassificacaoDoServico() {
		return classificacaoDoServico;
	}
	public void setClassificacaoDoServico(String classificacaoDoServico) {
		this.classificacaoDoServico = classificacaoDoServico;
	}
	public String getDescriçãoDoServico() {
		return descriçãoDoServico;
	}
	public void setDescriçãoDoServico(String descriçãoDoServico) {
		this.descriçãoDoServico = descriçãoDoServico;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getConcluidos() {
		return concluidos;
	}
	public void setConcluidos(int concluidos) {
		this.concluidos = concluidos;
	}
}
