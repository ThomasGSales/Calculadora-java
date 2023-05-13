package com.fag.interfacetrab;

import javax.swing.JOptionPane;

public class Main implements OperacaoMatematica {
	
	//THOMAS GABRIEL MARTINS SALES
	
	public static void main(String args[]) {
			
			Main main = new Main();
			main.realizarOperacao();
		
	}
	
	public void realizarOperacao() {
		
		String num1 = null;
		String num2 = null;
		float num1f = 0;
		float num2f = 0;
		
		Object[] opcoes = {"soma", "divisão", "multiplicação", "subtração"};
				
		Object scanOpcao = JOptionPane.showInputDialog(null, "Escolha uma operação", "calculadora", 3, null, opcoes, "");
				
		if(scanOpcao.equals("soma")) {
			num1 = JOptionPane.showInputDialog(null, "informe um numero");
			num1f = Float.parseFloat(num1);
			num2 = JOptionPane.showInputDialog(null, "informe mais um numero");
			num2f = Float.parseFloat(num2);
			
			JOptionPane.showMessageDialog(null, soma(num1f, num2f));
			
		} else if(scanOpcao.equals("divisão")) {
			num1 = JOptionPane.showInputDialog(null, "informe um numero");
			num1f = Float.parseFloat(num1);
			num2 = JOptionPane.showInputDialog(null, "informe mais um numero");
			num2f = Float.parseFloat(num2);
			
			JOptionPane.showMessageDialog(null, divisao(num1f, num2f));
			
		} else if(scanOpcao.equals("multiplicação")) {
			num1 = JOptionPane.showInputDialog(null, "informe um numero");
			num1f = Float.parseFloat(num1);
			num2 = JOptionPane.showInputDialog(null, "informe mais um numero");
			num2f = Float.parseFloat(num2);
			
			JOptionPane.showMessageDialog(null, multiplicacao(num1f, num2f));
			
		} else if(scanOpcao.equals("subtração")) {
			num1 = JOptionPane.showInputDialog(null, "informe um numero");
			num1f = Float.parseFloat(num1);
			num2 = JOptionPane.showInputDialog(null, "informe mais um numero");
			num2f = Float.parseFloat(num2);
			
			JOptionPane.showMessageDialog(null, subtracao(num1f, num2f));
		}
	}
	
	@Override
	public
	float soma(float n1, float n2) {
			
			return n1+n2;
	}
	
	@Override
	public
	float divisao(float n1, float n2) {
		
		return n1/n2;
	}
	
	@Override
	public
	float multiplicacao(float n1, float n2) {
		
		return n1*n2;
	}
	
	@Override
	public
	float subtracao(float n1, float n2) {
		
		return n1-n2;
	}

	
}


