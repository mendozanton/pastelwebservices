package com.api.pastelwebservices.model;

public class InfoObj {
	private int resultados;
	private int pagina;
	
	public int getResultados() {
		return resultados;
	}
	public void setResultados(int resultados) {
		this.resultados = resultados;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	public InfoObj(int resultados, int pagina) {
		this.resultados = resultados;
		this.pagina = pagina;
	}
	public InfoObj() {
	}
	

}
