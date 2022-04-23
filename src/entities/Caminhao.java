package entities;

public class Caminhao extends Veiculo{
	
	//atributo da classe
	Double dieselValue;
	
	//definindo construtor padr�o
	//construtor est� como public para que possa ser enchergado pale classe Main
	public Caminhao() {
		super();
	}
	
	//definindo construtor customizado
	//classe Veiculo a cor, modelo e capacidade do tanque, al�m do atributo desta pr�pria classe
	//construtor est� como public para que possa ser enchergado pela classe Main
	public Caminhao(String color, String model, Double tankCapacity, Double dieselValue) {
		//atributos herdados da classe Veiculo
		super(color, model, tankCapacity);
		//passando para o atributo da classe o dado contido no atributo recebido ppor par�metro
		this.dieselValue = dieselValue;
	}
	
	//retornando o dado contido no atributo dieselValue
	public Double getDieselValue() {
		return dieselValue;
	}
	
	//alterando o dado contido no atributo da classe para o dado contido no atributo passado por par�metro
	public void setDieselValue(Double dieselValue) {
		this.dieselValue = dieselValue;
	}

	//sobrepondo m�todo instanciado na classe veiculo
	@Override
	//m�todo que realiza o c�lculo do valor total para encher o tanque de combust�vel de um caminh�o com base no valo atual do litro
	public Double totalFuelValue() {
		
		//calculando o valor total para se encher o tanque de combust�vel
		Double totalValue = dieselValue * tankCapacity;
		
		//retornando o resultado do c�lculo
		return totalValue;
	}
	
	//m�todo toString utilizado para formatar e printar os dados
	public String toString() {
		return "\n" + "The color of the truck is " + color + "\n"
				+ "The model of the truck is " + model + "\n"
				+ "Fuel tank capacity is " + tankCapacity + "\n"
				+ String.format("The value of the litter diesel is R$%.2f ", dieselValue) + "\n"
				+ String.format("The total amount fill of the diesel is R$%.2f ", totalFuelValue());
	}
}
