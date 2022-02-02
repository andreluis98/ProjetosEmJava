package swing;

import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600,200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);//centralizar na tela do computador
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
//		botao.addActionListener(new ActionListener() {
//			
//
//			
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento ocorreu!!");
//				
//			}
//		});
		
		//Utilizando evento com lambda
		botao.addActionListener (e ->  { 
			System.out.println("Evento ocorreu!!!");
			});
//		
//		janela.addFocusListener(new FocusListener() {
//
//			@Override
//			public void focusGained(FocusEvent e) {
//				
//			}
//
//			@Override
//			public void focusLost(FocusEvent e) {
//				
//			}
//			
//		} );
		janela.setVisible(true);
		
	}
}
