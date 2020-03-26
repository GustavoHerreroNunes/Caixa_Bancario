/* Esta Classe de Modelagem tem por objetivo criar os atributos e m�todos necessarios
 * para um sistema de caixa banc�rio, onde teremos as op��es de  retirada e entrada
 * de valores do saldo do Usu�rio
 */

package Caixa;

import javax.swing.JOptionPane;

public class Caixa {
	
	private double saldo;//Passagem do atributo saldo, do tipo double (pela quest�o de valores monet�rios necessitarem de contar centavos) e private(por ser conveniente que nem todas as classes tenham acesso � um valor t�o particular)

	
	/*Criando Construtores*/
	public Caixa() {//Criando construtor sem parametros para inicializa��o de atributo
		this(0);
	}
	public Caixa(double saldo) {//Criando construtor com passagem de parametros para atribui��o de valor ao atributo saldo
		this.saldo = saldo;
	}
	
	
	/*Criando Getters e Setters*/
	public double getSaldo() {//Envio do valor da classe de "Modelagem" para a "Principal"(com rela��o � 'saldo')
		return saldo;
	}
	public void setSaldo(double saldo) {//Recebimento de valor da classe "Principal" para a de "Modelagem"(com rela��o � 'saldo')
		this.saldo = saldo;
	}
	
	
	/*Criando M�todos espec�ficos de Caixa*/
	public void entrar() {//M�todo p�blico sem retorno que sera utilizado para entrar um valor ao saldo do usu�rio
		double valor =0;
		
		valor=Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a somar ao seu Saldo", "DS_Bank", 1));//Solicitando o valor ao usu�rio
		
		this.setSaldo(this.saldo + valor);//Por meio do Setter 'setSaldo()' estou atribundo um novo valor total do saldo(somando o atual saldo ao valor digitado pelo usu�rio) fazendo refer�ncia ao pr�prio saldo
	}
	
	public void retirar() {//M�todo publico sem retorno para retirar uma determinada quantia do saldo do usu�rio
		double valor =0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da retirada", "DS_Bank", 1));//Solicitando valor ao usu�rio
		
		this.setSaldo(this.saldo - valor);//Uasando o Setter 'setSaldo()' subtrair o valor digitado pelo usu�rio do seu atual saldo fazendo refer�ncia ao pr�prio saldo
		
	}
	
	
}
