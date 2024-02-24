package iphone;

public abstract class Album  {
	private String nome;
	private String urlCapaAlbum;
	private String artista;
	
	public Album(String nome, String urlCapaAlbum, String artista) {
		this.nome = nome;
		this.urlCapaAlbum = urlCapaAlbum;
		this.artista = artista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlCapaAlbum() {
		return urlCapaAlbum;
	}

	public void setUrlCapaAlbum(String urlCapaAlbum) {
		this.urlCapaAlbum = urlCapaAlbum;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
}
