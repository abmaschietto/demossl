package com.example.demoewerton.models;

import java.util.List;

public class Comprovante{
	
    private String cliente;
    private String dataHoraConclusaoPesquisa;
    private Filial filial;
    private String nomeSolicitantePesquisa;
    private String nomePesquisado;
    private String cpf;
    private String tipoMotorista;
    private String protocolo;
    private String resultado;
    private String categoriaResultado;
    private List<String> observacoes;
    private String mensagemResponsabilidadeTelerisco;
    private String controle;
    
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDataHoraConclusaoPesquisa() {
		return dataHoraConclusaoPesquisa;
	}
	public void setDataHoraConclusaoPesquisa(String dataHoraConclusaoPesquisa) {
		this.dataHoraConclusaoPesquisa = dataHoraConclusaoPesquisa;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public String getNomeSolicitantePesquisa() {
		return nomeSolicitantePesquisa;
	}
	public void setNomeSolicitantePesquisa(String nomeSolicitantePesquisa) {
		this.nomeSolicitantePesquisa = nomeSolicitantePesquisa;
	}
	public String getNomePesquisado() {
		return nomePesquisado;
	}
	public void setNomePesquisado(String nomePesquisado) {
		this.nomePesquisado = nomePesquisado;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipoMotorista() {
		return tipoMotorista;
	}
	public void setTipoMotorista(String tipoMotorista) {
		this.tipoMotorista = tipoMotorista;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getCategoriaResultado() {
		return categoriaResultado;
	}
	public void setCategoriaResultado(String categoriaResultado) {
		this.categoriaResultado = categoriaResultado;
	}
	public List<String> getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(List<String> observacoes) {
		this.observacoes = observacoes;
	}
	public String getMensagemResponsabilidadeTelerisco() {
		return mensagemResponsabilidadeTelerisco;
	}
	public void setMensagemResponsabilidadeTelerisco(String mensagemResponsabilidadeTelerisco) {
		this.mensagemResponsabilidadeTelerisco = mensagemResponsabilidadeTelerisco;
	}
	public String getControle() {
		return controle;
	}
	public void setControle(String controle) {
		this.controle = controle;
	}
	@Override
	public String toString() {
		return "Comprovante [cliente=" + cliente + ", dataHoraConclusaoPesquisa=" + dataHoraConclusaoPesquisa
				+ ", filial=" + filial + ", nomeSolicitantePesquisa=" + nomeSolicitantePesquisa + ", nomePesquisado="
				+ nomePesquisado + ", cpf=" + cpf + ", tipoMotorista=" + tipoMotorista + ", protocolo=" + protocolo
				+ ", resultado=" + resultado + ", categoriaResultado=" + categoriaResultado + ", observacoes="
				+ observacoes + ", mensagemResponsabilidadeTelerisco=" + mensagemResponsabilidadeTelerisco
				+ ", controle=" + controle + "]";
	}
    
	
    
}