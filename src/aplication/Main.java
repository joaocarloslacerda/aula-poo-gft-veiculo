package aplication;

import java.util.Locale;
import java.util.Scanner;

//importate a classe Carro
import entities.Carro;

public class Main {

	public static void main(String[] args) {
		
		//alterando o idioma padrão de português para o americano
		Locale.setDefault(Locale.US);
		//criando objeto scanner por onde será realizada a entrada de dados padrão, ou seja, pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//solicitando para que o usuário informe a cor
		System.out.println("Tell the color:");
		//instanciando o atributo color e passando para ele o dado digitado pelo usuário
		String color = sc.nextLine();
		//solicitando que seja informado o modelo do carro
		System.out.println("Tell the car model:");
		//instanciando o atributo model e passando para ele o dado digitado pelo usuário
		String model = sc.nextLine();
		//solicitando que o usuário informe a capacidade do tanque de gasolina
		System.out.println("Tell the tank capacity gasoline:");
		//instandiando o atributo tankCapacity e passando para ele o dado digitado pelo usuário
		Double tankCapacity = sc.nextDouble();
		
		//questionando qual o tipo de veículo em questão
		System.out.println("Car, truck or motorcycle (c/t/m)?");
		//armazenando no atributo op o caracter digitado pelo usuário
		char op = sc.next().charAt(0);
		
		
		if(op == 'c') {
			//solicitando que o usuário informe o preço da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usuário
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto car do tipo Carro, e passando um new Carro com os parâmetros color, model tankCapacity
			Carro car = new Carro(color, model, tankCapacity, gasolineValue);
			
			//chamando método toString para mostrar os dados conforme formatação contida no método
			System.out.println(car.toString());
		}
		
		//***********implementar opção para caminhão e moto
		
		//encerrando o objeto sc
		sc.close();
	}
}
