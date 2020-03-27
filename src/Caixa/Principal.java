/*Esta � a classe principal do meu projeto, nela ser� feito o menu principal para coordenar os m�todos da classe Caixa*/

package Caixa;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		String ope[] = {"Sair", "Entrada", "Retirada", "Consulta de Saldo"};
		ImageIcon logo = new ImageIcon("Imagens/logo.png");
		
		Caixa cx1 = new Caixa();//Inst�nciando minha classe 'Caixa'
		
		/*Execute as opera��es, enquanto o usu�rio n�o desejar sair*/
		do {
			op = JOptionPane.showOptionDialog(null, "Escolha a opera��o a se fazer", "DS_Bank", -1, -1, logo, ope, ope[0]);//Apresentando op��es de opera��es ao Usu�rio
			switch(op) {
			
			case 1: //Entrar com valor ao saldo
				cx1.entrar();
				break;
				
			case 2://Retirar um valor do saldo
				cx1.retirar();
				break;
				
			case 3://Consultar atual saldo
				JOptionPane.showMessageDialog(null, "Seu saldo atual � de: R$:" + cx1.getSaldo(), "DS_Bank", -1, logo);
				break;
				
			default://Encerrar sistema
				JOptionPane.showMessageDialog(null, "Sistema ecerrando...\nVolte sempre!!!", "DS_Bank", -1, logo);
				break;
			}
		}while(op >0);//Obtem-se um valor menor que >=0 clicando nas op��es de sa�da
	} 
}
