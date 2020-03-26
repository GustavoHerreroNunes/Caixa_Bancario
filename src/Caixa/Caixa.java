/* Esta Classe de Modelagem tem por objetivo criar os atributos e métodos necessarios
 * para um sistema de caixa bancário, onde teremos as opções de  retirada e entrada
 * de valores do saldo do Usuário
 */

package Caixa;

import javax.swing.JOptionPane;

public class Caixa {
	
	private double saldo;//Passagem do atributo saldo, do tipo double (pela questão de valores monetários necessitarem de contar centavos) e private(por ser conveniente que nem todas as classes tenham acesso à um valor tão particular)

	
	/*Criando Construtores*/
	public Caixa() {//Criando construtor sem parametros para inicialização de atributo
		this(0);
	}
	public Caixa(double saldo) {//Criando construtor com passagem de parametros para atribuição de valor ao atributo saldo
		this.saldo = saldo;
	}
	
	
	/*Criando Getters e Setters*/
	public double getSaldo() {//Envio do valor da classe de "Modelagem" para a "Principal"(com relação à 'saldo')
		return saldo;
	}
	public void setSaldo(double saldo) {//Recebimento de valor da classe "Principal" para a de "Modelagem"(com relação à 'saldo')
		this.saldo = saldo;
	}
	
	
	/*Criando Métodos específicos de Caixa*/
	public void entrar() {//Método público sem retorno que sera utilizado para entrar um valor ao saldo do usuário
		double valor =0;
		
		valor=Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor a somar ao seu Saldo", "DS_Bank", 1));//Solicitando o valor ao usuário
		
		this.setSaldo(this.saldo + valor);//Por meio do Setter 'setSaldo()' estou atribundo um novo valor total do saldo(somando o atual saldo ao valor digitado pelo usuário) fazendo referência ao próprio saldo
	}
	
	public void retirar() {//Método publico sem retorno para retirar uma determinada quantia do saldo do usuário
		double valor =0;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da retirada", "DS_Bank", 1));//Solicitando valor ao usuário
		
		this.setSaldo(this.saldo - valor);//Uasando o Setter 'setSaldo()' subtrair o valor digitado pelo usuário do seu atual saldo fazendo referância ao próprio saldo
		
	}
	
	
}
