package view;

import javax.swing.JOptionPane;

import controller.MDC;

public class Main {
	
	public static void main(String[] args) {
		
		int x, y;
		
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero"));
			y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero"));

			if (x <= 0 || y <= 0) {
				JOptionPane.showMessageDialog(null, "O valor nao pode ser menor que 0");
			}
			
		}while(x <= 0 || y <= 0);
		
		MDC mdc = new MDC();
		
		int resultado = mdc.medir(x, y);
		
		JOptionPane.showMessageDialog(null, "O resultado do MDC de " + y + " e " + x + " é igual a: " + resultado);
		
		
	}
}
