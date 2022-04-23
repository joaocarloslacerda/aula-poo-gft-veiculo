package aplication;

import java.util.Locale;
import java.util.Scanner;

//importando a classe Carro
import entities.Carro;
//importando a classe Moto
import entities.Moto;

public class Main {

	public static void main(String[] args) {
		
		//alterando o idioma padrão de português para o americano
		Locale.setDefault(Locale.US);
		//criando objeto scanner por onde será realizada a entrada de dados padrão, ou seja, pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//questionando qual o tipo de veículo em questão
		System.out.println("Car, truck or motorcycle (c/t/m)?");
		//armazenando no atributo op o caracter digitado pelo usuário
		char op = sc.next().charAt(0);
		//limpando buffer
		sc.nextLine();
		
		//solicitando para que o usuário informe a cor
		System.out.println("Tell the color:");
		//instanciando o atributo color e passando para ele o dado digitado pelo usuário
		String color = sc.nextLine();
		//solicitando que seja informado o modelo do carro
		System.out.println("Tell the vehicle model:");
		//instanciando o atributo model e passando para ele o dado digitado pelo usuário
		String model = sc.nextLine();
		//solicitando que o usuário informe a capacidade do tanque de combustível
		System.out.println("Tell the tank capacity fuel:");
		//instandiando o atributo tankCapacity e passando para ele o dado digitado pelo usuário
		Double tankCapacity = sc.nextDouble();
				
		if(op == 'c') {
			//solicitando que o usuário informe o preço da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usuário
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto car do tipo Carro, e passando um new Carro com os parâmetros color, model e tankCapacity
			Carro car = new Carro(color, model, tankCapacity, gasolineValue);
			
			//chamando método toString para mostrar os dados conforme formatação contida no método
			System.out.println(car.toString());
		}
		/*else if(op == 't') {
			
		}*/
		else if(op == 'm') {
			//solicitando que o usuário informe o preço da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usuário
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto motorCycle do tipo Moto, e passando um new Moto com os parâmetros color, model e tankCapacity
			Moto motorCycle = new Moto(color, model, tankCapacity, gasolineValue);
			
			//chamando método toString para mostrar os dados conforme formatação contida no método
			System.out.println(motorCycle.toString());
		}
		
		
		//***********implementar opção para caminhão
		
		//encerrando o objeto sc
		sc.close();
	}
}
