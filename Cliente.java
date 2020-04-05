package exercicios;

//Exercícios Lista 1



public class Cliente {

	private int codigo;
	private String nome;
	private boolean eClienteEspecial;
	private double limiteCredito;
	
	public Cliente(int c, String n)
	{
	this.codigo = c;
	this.nome = n;
	limiteCredito = 0;
	eClienteEspecial = false;
	}
	
	public String obterNome()
	{
		return this.nome;
	}
	
	public boolean atualizaLimite(double valor)
	{
		if(eClienteEspecial)
		{
			this.limiteCredito = valor;
			return true;
		}
		else
			return false;
					
	}
	
	public void atualizaSituacao(boolean estado)
	{
		if(estado)
			eClienteEspecial = true;
		else
		{
			eClienteEspecial = false;
			this.limiteCredito = 0;

			

		}
	}
	
	
}
