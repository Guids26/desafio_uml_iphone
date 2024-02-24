package iphone;

import java.util.List;

public class Iphone {

	private Integer anoLancamento;
	private String modelo;
	private Integer quantidadeMemoria;
	private Integer volume;
	private List<ReprodutorMusical> reprodutoresMusicais;
	private List<Navegador> navegadores;
	private AparelhoTelefonico aparelhoTelefonico;
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getQuantidadeMemoria() {
		return quantidadeMemoria;
	}
	public void setQuantidadeMemoria(Integer quantidadeMemoria) {
		this.quantidadeMemoria = quantidadeMemoria;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public List<ReprodutorMusical> getReprodutoresMusicais() {
		return reprodutoresMusicais;
	}
	public void setReprodutoresMusicais(List<ReprodutorMusical> reprodutoresMusicais) {
		this.reprodutoresMusicais = reprodutoresMusicais;
	}
	public List<Navegador> getNavegadores() {
		return navegadores;
	}
	public void setNavegadores(List<Navegador> navegadores) {
		this.navegadores = navegadores;
	}
	public AparelhoTelefonico getAparelhoTelefonico() {
		return aparelhoTelefonico;
	}
	public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
		this.aparelhoTelefonico = aparelhoTelefonico;
	}
	
	public void ligar() {
		System.out.println("Ligando aparelho...");
	}
	
	public void desligar() {
		System.out.println("Desligando aparelho...");
	}
	
	public void aumentarVolume() {
		System.out.println("Volume aumentado!");
	}
	
	public void diminuirVolume() {
		System.out.println("Volume diminuido!");
	}
}
