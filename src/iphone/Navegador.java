package iphone;

import java.util.List;

public class Navegador {
	private List<Aba> abas;
	private Integer quantidadeAbas;
	private List<String> favoritos;

	public List<String> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<String> favoritos) {
		this.favoritos = favoritos;
	}

	public List<Aba> getAbas() {
		return abas;
	}

	public void setAbas(List<Aba> abas) {
		this.abas = abas;
	}

	public Integer getQuantidadeAbas() {
		return quantidadeAbas;
	}

	public void setQuantidadeAbas(Integer quantidadeAbas) {
		this.quantidadeAbas = quantidadeAbas;
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo P�gina...");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada!");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando p�gina...");
	}
	
	public void adicionarFavorito() {
		System.out.println("Favorito adicionado!");
	}
	
	public void removerFavorito() {
		System.out.println("Favorito removido!");
	}

}
