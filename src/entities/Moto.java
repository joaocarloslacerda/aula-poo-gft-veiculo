package entities;

public class Moto extends Veiculo {
	
	//atributos da classe
	Double gasolineValue;
	
	//definindo construtor padrão
	//construtor está como public para que seja enchergado pela classe Main
	public Moto(){
		super();
	}
	
	//definindo construtor customizado, sendo recebido atraves dele os atributos herdados da 
	//classe Veiculo a cor, modelo e capacidade do tanque, além do atributo desta própria classe
	//construtor está como public para que seja enchergado pela classe Main
	public Moto(String color, String model, Double tankCapacity, Double gasolineValue){
		//atributos herdados da classe Veiculo
		super(color, model, tankCapacity);
		//passando para o atributo desta classe o dado contido no atributo recebido por parâmetro
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
	
	//sobrepondo o método totalFuelValue herdade e instanciado na classe Veiculo
	@Override
	//método para calcular o custo total para se encher o tanque de combustível do veículo com base no valor atual no litro
	public Double totalFuelValue() {
		
		//calculando o valor total para se encher o tanque de gasoline com base no valor do combustível
		Double totalValue = gasolineValue * tankCapacity;
		
		//retornando o resultado do cálculo
		return totalValue;
	}
	
	//método toString utilizado para formatar e printar os dados
	public String toString() {
		return "\n" + "The color of the motorcycle is " + color + "\n"
				+ "The model of the motorcycle is " + model + "\n"
				+ "Gas tank capacity is " + tankCapacity + "\n"
				+ String.format("The value of the litter gasoline is R$%.2f ", gasolineValue) + "\n"
				+ String.format("The total amount to fill gasoline is R$%.2f ", totalFuelValue());
	}
}
