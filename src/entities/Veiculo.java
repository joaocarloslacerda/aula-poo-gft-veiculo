package entities;

public abstract class Veiculo {
	
	//definindo atributos da classe
	String color;
	String model;
	Double tankCapacity;
	
	//definindo construtor padrão
	Veiculo(){
	}
	
	//definindo construtor personalizado
	Veiculo(String color, String model, Double tankCapacity){
		//atribuindo ao atributo da classe o parâmetro contido no atributo do construtor
		this.color = color;
		this.model = model;
		this.tankCapacity = tankCapacity;
	}
	
	//retornando dado contido no atributo color
	public String getColor() {
		return color;
	}
	
	//retornando dado contido no atributo model
	public String getModel() {
		return model;
	}
	
	//retornando dado contido no atriuto tankcapacity
	public Double getTankCapacity() {
		return tankCapacity;
	}
	
	public abstract Double totalFuelValue();

}
