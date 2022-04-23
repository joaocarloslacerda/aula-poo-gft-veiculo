package entities;

public class Carro extends Veiculo{
	
	//atributo da classe
	Double gasolineValue;
	
	//definindo construtor padrão
	//construtor está como public para que seja enchergado pela classe Main
	Carro(){
		super();
	}
	
	//definindo construtor customizado, sendo recebido atraves dele os atributos herdados da 
	//classe Veiculo a cor, modelo e capacidade do tanque, além do atributo desta própria classe 
	//construtor está como public para que seja enchergado pela classe Main
	public Carro(String color, String model, Double tankCapacity, Double gasolineValue){
		//atribuindo herdados da classe veiculo
		super(color, model, tankCapacity);
		//passando para o atributo desta classe o dado contido no atributo recebido por parâmetro
		this.gasolineValue = gasolineValue;
	}
		
	//retornando dado contido no atributo gasoline_value
	public Double getGasolineValue() {
		return gasolineValue;
	}
	
	//alterando o dado contido no atributo da classe para o dado contido no atributo passado por parâmetro
	public void setGasolineValue(Double gasolineValue) {
		this.gasolineValue = gasolineValue;
	}
	
	//sobrepondo o método totalFuelValue instanciado na superclasse Veiculo
	@Override
	//método para calcular o valor total para encher um tanque de gasolina
	public Double totalFuelValue() {
		
		//calculando o valor total para encher um tanque de combustível com base no valor do combustível
		Double totalValue = gasolineValue * tankCapacity;
		
		//retornando o valor total para encher um tanque de gasolina
		return totalValue;
	}
	
	//método toString utilizado para formatar e printar os dados
	public String toString() {
		return "\n" + "The color of the car is " + color + "\n"
				+ "The model os the car is " + model + "\n"
				+ "Fuel tank capacity is " + tankCapacity + " liter" + "\n"
				+ String.format("The value of the liter gasoline is R$%.2f", gasolineValue) + "\n"
				+ String.format("The total amount to fill gasoline tank is R$%.2f", totalFuelValue());
	}
}
