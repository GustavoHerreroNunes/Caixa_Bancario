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
		
		do {
			op = JOptionPane.showOptionDialog(null, "Escolha a opera��o a se fazer", "DS_Bank", -1, -1, logo, ope, ope[0]);
			switch(op) {
			
			case 1: 
				cx1.entrar();
				break;
			case 2:
				cx1.retirar();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Seu saldo atual � de: R$:" + cx1.getSaldo(), "DS_Bank", -1, logo);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Sistema ecerrando...\nVolte sempre!!!", "DS_Bank", -1, logo);
			}
		}while(op !=0);
	} 
}
