package aplication;

import java.util.Locale;
import java.util.Scanner;

//importando a classe Carro
import entities.Carro;
//importando a classe Moto
import entities.Moto;

public class Main {

	public static void main(String[] args) {
		
		//alterando o idioma padr�o de portugu�s para o americano
		Locale.setDefault(Locale.US);
		//criando objeto scanner por onde ser� realizada a entrada de dados padr�o, ou seja, pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//questionando qual o tipo de ve�culo em quest�o
		System.out.println("Car, truck or motorcycle (c/t/m)?");
		//armazenando no atributo op o caracter digitado pelo usu�rio
		char op = sc.next().charAt(0);
		//limpando buffer
		sc.nextLine();
		
		//solicitando para que o usu�rio informe a cor
		System.out.println("Tell the color:");
		//instanciando o atributo color e passando para ele o dado digitado pelo usu�rio
		String color = sc.nextLine();
		//solicitando que seja informado o modelo do carro
		System.out.println("Tell the vehicle model:");
		//instanciando o atributo model e passando para ele o dado digitado pelo usu�rio
		String model = sc.nextLine();
		//solicitando que o usu�rio informe a capacidade do tanque de combust�vel
		System.out.println("Tell the tank capacity fuel:");
		//instandiando o atributo tankCapacity e passando para ele o dado digitado pelo usu�rio
		Double tankCapacity = sc.nextDouble();
				
		if(op == 'c') {
			//solicitando que o usu�rio informe o pre�o da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usu�rio
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto car do tipo Carro, e passando um new Carro com os par�metros color, model e tankCapacity
			Carro car = new Carro(color, model, tankCapacity, gasolineValue);
			
			//chamando m�todo toString para mostrar os dados conforme formata��o contida no m�todo
			System.out.println(car.toString());
		}
		/*else if(op == 't') {
			
		}*/
		else if(op == 'm') {
			//solicitando que o usu�rio informe o pre�o da gasolina
			System.out.println("Tell the price gasoline:");
			//inicializando o atributo gasolineValue e passando o dado digita pelo usu�rio
			double gasolineValue = sc.nextFloat();
			
			//instanciando e inicializando um novo objeto motorCycle do tipo Moto, e passando um new Moto com os par�metros color, model e tankCapacity
			Moto motorCycle = new Moto(color, model, tankCapacity, gasolineValue);
			
			//chamando m�todo toString para mostrar os dados conforme formata��o contida no m�todo
			System.out.println(motorCycle.toString());
		}
		
		
		//***********implementar op��o para caminh�o
		
		//encerrando o objeto sc
		sc.close();
	}
}
