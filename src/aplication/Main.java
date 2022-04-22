package aplication;

import java.util.Locale;
import java.util.Scanner;

//importate a classe Carro
import entities.Carro;

public class Main {

	public static void main(String[] args) {
		
		//alterando o idioma padr�o de portugu�s para o americano
		Locale.setDefault(Locale.US);
		//criando objeto scanner por onde ser� realizada a entrada de dados padr�o, ou seja, pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//solicitando para que o usu�rio informe a cor
		System.out.println("Tell the color:");
		//instanciando o atributo color e passando para ele o dado digitado pelo usu�rio
		String color = sc.nextLine();
		//solicitando que seja informado o modelo do carro
		System.out.println("Tell the car model:");
		//instanciando o atributo model e passando para ele o dado digitado pelo usu�rio
		String model = sc.nextLine();
		//solicitando que o usu�rio informe a capacidade do tanque de gasolina
		System.out.println("Tell the tank capacity gasoline:");
		//instandiando o atributo tankCapacity e passando para ele o dado digitado pelo usu�rio
		Double tankCapacity = sc.nextDouble();
		
		//questionando qual o tipo de ve�culo em quest�o
		System.out.println("Car, truck or motorcycle (c/t/m)?");
		//armazenando no atributo op o caracter digitado pelo usu�rio
		char op = sc.next().charAt(0);
		
		
		if(op == 'c') {
			//solicitando que o usu�rio informe o pre�o da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usu�rio
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto car do tipo Carro, e passando um new Carro com os par�metros color, model tankCapacity
			Carro car = new Carro(color, model, tankCapacity, gasolineValue);
			
			//chamando m�todo toString para mostrar os dados conforme formata��o contida no m�todo
			System.out.println(car.toString());
		}
		
		//***********implementar op��o para caminh�o e moto
		
		//encerrando o objeto sc
		sc.close();
	}
}
