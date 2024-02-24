package iphone;

public class AparelhoTelefonico {
	private Integer numeroTelefonico;

	public Integer getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(Integer numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
	public void ligar(int numeroTelefonico) {
		System.out.println("Ligando para o numero... " + numeroTelefonico);
	}
	
	public void atender() {
		System.out.println("Ligação atendida!");
	}
	
	public void recusarChamada() {
		System.out.println("Chamada recusada!");
	}
	
	public void desligarChamada() {
		System.out.println("Ligação desligada!");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
