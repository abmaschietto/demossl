package com.example.demoewerton.models;

public class Filial{
	
    private String cnpjFilial;
    private String uf;
    private String nome;
    
	public String getCnpjFilial() {
		return cnpjFilial;
	}
	public void setCnpjFilial(String cnpjFilial) {
		this.cnpjFilial = cnpjFilial;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Filial [cnpjFilial=" + cnpjFilial + ", uf=" + uf + ", nome=" + nome + "]";
	}
    
    
}