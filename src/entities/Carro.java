package entities;

public class Carro extends Veiculo{
	
	//atributo da classe
	Double gasolineValue;
	
	//definindo construtor padr�o
	//construtor est� como public para que seja enchergado pela classe Main
	Carro(){
		super();
	}
	
	//definindo construtor customizado, sendo recebido atraves dele os atributos herdados da 
	//classe Veiculo a cor, modelo e capacidade do tanque, al�m do atributo desta pr�pria classe 
	//construtor est� como public para que seja enchergado pela classe Main
	public Carro(String color, String model, Double tankCapacity, Double gasolineValue){
		//atribuindo herdados da classe veiculo
		super(color, model, tankCapacity);
		//passando para o atributo desta classe o dado contido no atributo recebido por par�metro
		this.gasolineValue = gasolineValue;
	}
		
	//retornando dado contido no atributo gasoline_value
	public Double getGasolineValue() {
		return gasolineValue;
	}
	
	//alterando o dado contido no atributo da classe para o dado contido no atributo passado por par�metro
	public void setGasolineValue(Double gasolineValue) {
		this.gasolineValue = gasolineValue;
	}
	
	//sobrepondo o m�todo totalFuelValue instanciado na superclasse Veiculo
	@Override
	//m�todo para calcular o valor total para encher um tanque de gasolina
	public Double totalFuelValue() {
		
		//calculando o valor total para encher um tanque de combust�vel com base no valor do combust�vel
		Double totalValue = gasolineValue * tankCapacity;
		
		//retornando o valor total para encher um tanque de gasolina
		return totalValue;
	}
	
	//m�todo toString utilizado para formatar e printar os dados
	public String toString() {
		return "\n" + "The color of the car is " + color + "\n"
				+ "The model os the car is " + model + "\n"
				+ "Fuel tank capacity is " + tankCapacity + " liter" + "\n"
				+ String.format("The value of the liter gasoline is R$%.2f", gasolineValue) + "\n"
				+ String.format("The total amount to fill gasoline tank is R$%.2f", totalFuelValue());
	}
}
