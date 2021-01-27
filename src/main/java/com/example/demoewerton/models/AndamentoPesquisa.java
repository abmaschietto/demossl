package com.example.demoewerton.models;

public class AndamentoPesquisa{
	
    private String retornoWs;
    private String mensagemRetorno;
    private Comprovante comprovante;
    
	public String getRetornoWs() {
		return retornoWs;
	}
	public void setRetornoWs(String retornoWs) {
		this.retornoWs = retornoWs;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	public Comprovante getComprovante() {
		return comprovante;
	}
	public void setComprovante(Comprovante comprovante) {
		this.comprovante = comprovante;
	}
	@Override
	public String toString() {
		return "AndamentoPesquisa [retornoWs=" + retornoWs + ", mensagemRetorno=" + mensagemRetorno + ", comprovante="
				+ comprovante + "]";
	}
    
    
}
