package entities;

public class Carro extends Veiculo{
	
	//atributo da classe
	Double gasolineValue;
	
	//definindo construtor padr�o
	Carro(){
		super();
	}
	
	//definindo construtor customizado, sendo recebido atraves dele os atributos herdados da 
	//classe Veiculo a cor, modelo e capacidade do tanque, al�m do atributo desta pr�pria classe 
	public Carro(String color, String model, Double tankCapacity, Double gasolineValue){
		//atribuindo herdados da classe veiculo
		super(color, model, tankCapacity);
		//passando para o atributo desta classe o dado contido no atributo recebido por par�metro
		this.gasolineValue = gasolineValue;
	}
		
	//retornando dado contido no atributo gasoline_value
	public double getGasolineValue() {
		return gasolineValue;
	}
	
	//alterando o valor da gasolina contida no atributo gasolineValue
	public void setGasolineValue(double gasolineValue) {
		this.gasolineValue = gasolineValue;
	}
	
	//sobrepondo o m�todo totalFuelValue instanciado na superclasse Veiculo
	@Override
	//m�todo para calcular o valor total para encher um tanque de gasolina
	public Double totalFuelValue() {
		
		//calculando o valor total para encher um tanque de combust�vel com base no valor do combust�vel
		double totalValue = gasolineValue * tankCapacity;
		
		//retornando o valor total para encher um tanque de gasolina
		return totalValue;
	}
	
	//m�todo toString utilizado para formatar e printar os dados
	public String toString() {
		return "The color of the car is " + color + "\n"
				+ "The model os the car is " + model + "\n"
				+ "Gas tank capacity is " + tankCapacity + " liter" + "\n"
				+ String.format("The value of the liter gasoline is R$%.2f", gasolineValue) + "\n"
				+ String.format("The total amount to fill gasoline tank is R$%.2f", totalFuelValue());
	}
}
