# Exercício de POO do bootcamp GFT da DIO
Exercício consiste na entrada de dados de um veículo e o preço do combustível, 
com isto é realizado o cálculo para saber o valor total para encher o tanque.

      *O projeto consiste em dois pacotes, um denominado aplication contendo a classe main, e um denominado entities contendo as classes Veiculo, Carro, Moto e Caminhão
      *na classe Main é realizada a entrada de dados e além disto é onde existe a solicitação para que o usuário informe o tipo de veículo
      *a classe Veiculo é herdada pelas classes Carro, Moto e Caminhão. Nela são encontrados os atributos color, model e tankCapacity, além do método totalFuelValue que é instanciado nela e utilizado de uma forma diferente em cada uma das classes que herdam a Veiculo
      *nas classes Carro, Moto e Caminhão é utilizado o método totalFuelValue com o conceito de Polimorfismo para realizar o cálculo do valor total para se encher o tanque, também em cada uma existe um atributo que corresponde ao tipo de combustível que o veiculo em questão utiliza, e além disto, na saída de dados é usadao um método toString formatando as informações que vão aparecer para o usuário
