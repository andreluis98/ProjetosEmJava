package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomedoAtributo) {
		this.nomeDoAtributo = nomedoAtributo;
	}
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}

}
