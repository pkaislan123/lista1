package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
		int opcao = 0;
		Scanner entradaOpcao = new Scanner(System.in);

	
		
		while(opcao != 5 || opcao < 0 || opcao > 5) {	
        	System.out.println("*******Menu********\n"
        			+ "Digite Uma opção:\n"
        			+ "1 - Exercício 1\n"
        			+ "2 - Exercício 3\n"
        			+ "3 - Exercício 4\n"
        			+ "4 - Exercício 5\n"
        			);
         
            opcao = entradaOpcao.nextInt();

         switch(opcao)
         {
         case 1:
         {
        	 exerLis1();
        	 
         }
                  
         case 2:
         {
        	 exerLis3(); 
         }
         
         case 3:
         {
        	 exerLis4(); 

         }
         
         case 4:
         {
        	 exerLis5(); 
 
         }
         }
		}
		
	}
         
         
   public static void exerLis1()
   {

		Cliente cliA, cliB;
		

		cliA  = new Cliente(1, "Luiza");
		cliA.atualizaSituacao(true);

		cliB = new Cliente(2, "Wesley");
		
		if(!cliA.atualizaLimite(500))
		{
			System.out.println("1Este nao e um cliente especial\n");
		}
		
		cliB = cliA;
		cliB.atualizaSituacao(false);
		
		if(!cliA.atualizaLimite(700))
		{
			System.out.println("Este nao e um cliente especial\n");
		}
		
   }
   
   public static void exerLis3()
   {
	   Pessoa [] pessoas = new Pessoa[10];
	   String nome ;
   	   int idade;
	   System.out.println("Cadastre 10 clientes");
		
		
        for(int i = 1; i <= 10; i++)
        {
        
    		Scanner entradas = new Scanner(System.in);
    		System.out.println("Nome para Pessoa " + i + ": ");
    		nome = entradas.next();
    		
    		
    		System.out.println("Idade Pessoa "+i+": ");
    		idade = entradas.nextInt();
    		
    		System.out.println("Pessoa " + i + ", Nome: " + nome + ", Idade: "+ idade);
    		
    		pessoas[i] = new Pessoa(nome, idade);
    	
        }
        
		System.out.println("\n\n\n Lista de Pessoas Invertidas:");

        for(int i = 10; i >= 1 ; i--)
        {
    		System.out.println("Pessoa " + i + ", Nome: " + pessoas[i].getNome() + ", Idade: "+ pessoas[i].getIdade());
         
        }
	   
	   
         
   }
   
   public static void exerLis4()
   {
	   
	   Veiculo [][]veiculos = new Veiculo[5][5];
	   String marca, modelo;
	   int ano;
	   
	   System.out.println("Cadastre 25 veiculos");
		
		
       for(int i = 1; i <= 5; i++)
       {
         for(int j = 1; j <= 5; j++)
         {
        	    Scanner entradas = new Scanner(System.in);
        		System.out.printf("Marca para Veiculo, Linhas %d | Coluna %d", i, j );
        		marca = entradas.next();
        		
        		
        		System.out.printf("Modelo para Veiculo, Linhas %d | Coluna %d", i, j );
        		modelo = entradas.next();
        		
        		System.out.printf("Ano para Veiculo, Linhas %d | Coluna %d", i, j );
        		ano = entradas.nextInt();
        		
        		veiculos[i][j] = new Veiculo(marca, modelo, ano);
        		
         }
   		
   	
       }
	   
   	System.out.println("\n\n\n Lista de Veiculos Invertidas:");

    for(int i = 5; i >= 1 ; i--)
    {
    	 for(int j = 5; j >= 1 ; j--)
    	    {
    			System.out.printf("Veiculo na posicao %d x %d\n Marca: %s, Modelo: %s, Ano: %d\n", i, j, veiculos[i][j].getMarca(),veiculos[i][j].getModelo(),veiculos[i][j].getAno() );

    	    }
    	    }
     
    }
	   
   
   public static void exerLis5()
   {
	   Integer [] vetor1 = new Integer[100];
	   Integer [] vetor2 = new Integer[100];
	   
	   int valor;
	   
	   System.out.println("Informe os 100 primeiros valores");

	   for(int i = 0; i < 100; i++)
	   {
		   Scanner entradas = new Scanner(System.in);
   		System.out.printf("Valor na posicao %d: ", i);
   		valor = entradas.nextInt();
   		vetor1[i] = valor;
	   }
	   
	   System.out.println("Informe mais 100 valores");
	   for(int i = 0; i < 100; i++)
	   {
		   Scanner entradas = new Scanner(System.in);
   		System.out.printf("Valor na posicao %d: ", i);
   		valor = entradas.nextInt();
   		vetor2[i] = valor;

	   }
	   
	   System.out.println("Calculando, aguarde...");

	   Integer [] vetor3 = new Integer[100];
       for(int i = 0,j = 0, k = 99; i < 100; i++,j++, k--)
       {
    	   vetor3[i] = vetor1[j] * vetor2[k];
    	   System.out.printf("Resultado Parcial, Linha %d: %d\n", i, vetor3[i]);

       }
       
       
	   System.out.println("Calculando, aguarde");
	   try {
		   Thread.sleep(2000);
		} catch (Exception e) {
		   e.printStackTrace();
		}
	   
	   System.out.println("Resultado com a ordem invertida");
	   for(int i = 99; i >= 0; i--)
	   {
		   System.out.printf("Linha %d, Resultado: %d\n", i, vetor3[i] );
	   }


	   
   }

   
}
