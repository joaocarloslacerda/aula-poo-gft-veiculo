package entities;

public class Caminhao extends Veiculo{
	
	//atributo da classe
	Double dieselValue;
	
	//definindo construtor padrão
	//construtor está como public para que possa ser enchergado pale classe Main
	public Caminhao() {
		super();
	}
	
	//definindo construtor customizado
	//classe Veiculo a cor, modelo e capacidade do tanque, além do atributo desta própria classe
	//construtor está como public para que possa ser enchergado pela classe Main
	public Caminhao(String color, String model, Double tankCapacity, Double dieselValue) {
		//atributos herdados da classe Veiculo
		super(color, model, tankCapacity);
		//passando para o atributo da classe o dado contido no atributo recebido ppor parâmetro
		this.dieselValue = dieselValue;
	}
	
	//retornando o dado contido no atributo dieselValue
	public Double getDieselValue() {
		return dieselValue;
	}
	
	//alterando o dado contido no atributo da classe para o dado contido no atributo passado por parâmetro
	public void setDieselValue(Double dieselValue) {
		this.dieselValue = dieselValue;
	}

	//sobrepondo método instanciado na classe veiculo
	@Override
	//método que realiza o cálculo do valor total para encher o tanque de combustível de um caminhão com base no valo atual do litro
	public Double totalFuelValue() {
		
		//calculando o valor total para se encher o tanque de combustível
		Double totalValue = dieselValue * tankCapacity;
		
		//retornando o resultado do cálculo
		return totalValue;
	}
	
	//método toString utilizado para formatar e printar os dados
	public String toString() {
		return "\n" + "The color of the truck is " + color + "\n"
				+ "The model of the truck is " + model + "\n"
				+ "Fuel tank capacity is " + tankCapacity + "\n"
				+ String.format("The value of the litter diesel is R$%.2f ", dieselValue) + "\n"
				+ String.format("The total amount fill of the diesel is R$%.2f ", totalFuelValue());
	}
}
