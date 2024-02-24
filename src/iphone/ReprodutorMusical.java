package iphone;

public class ReprodutorMusical {
	
	private Musica musica;
	
	public void tocarMusica(Musica musica) {
		System.out.println("Tocando m�sica...");
	}
	
	public void pausar() {
		System.out.println("Musica pausada");
	}
	
	public void selecionarMusica() {
		System.out.println("Musica selecionada!");
	}
	
	public void avancar() {
		System.out.println("Avan�ando para a pr�xima musica...");
	}
	
	public void voltar() {
		System.out.println("Voltando para a musica anterior...");
	}
	
	public void adicionarNaPlaylist() {
		System.out.println("Musica adicionada a playlist");
	}
	
	public void removerDaPlaylist() {
		System.out.println("Musica removida da playlist");
	}

}
