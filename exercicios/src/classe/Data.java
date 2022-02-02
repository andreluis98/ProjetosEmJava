package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	//Construtor
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	//Exemplo de como utilizar o THIS
	/*
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	*/
	//Metodo
	String obterDataFormatada() {
		return String.format("%d,%d,%d\n" + this.dia,mes,ano);
	}
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	

}
