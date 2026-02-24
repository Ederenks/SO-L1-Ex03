package View;
import javax.swing.JOptionPane;

import Controller.*;
public class Main {
	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int n = -1;
		while (n<0 || n>100) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor (>0 e <100)"));
		}
		int []vet = new int[n];
		for (int i=0;i<n;i++) {
			vet[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1)+ "termo"));
		}
		op.vetoriar(vet);
	}
}
