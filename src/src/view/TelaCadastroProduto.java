package src.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import src.controller.ControllerProduto;

public class TelaCadastroProduto {

	private JFrame janela = new JFrame();

	private JLabel labelMensagens  = new JLabel();

	private JPanel formulario = new JPanel(new GridLayout(2 ,2));

	private JLabel labelNome = new JLabel("Nome");

	private JLabel labelPreco = new JLabel("Preço");

	private JTextField fieldNome = new JTextField();

	private JTextField fieldPreco = new JTextField();

	private JButton buttonSalvar = new JButton("Registrar venda de somente 1 "
			+ "produto!");

	public TelaCadastroProduto() {
		janela.setTitle("Cadastro de Produto");

		janela.add(labelMensagens, BorderLayout.PAGE_START);

		formulario.add(labelNome);

		formulario.add(fieldNome);

		formulario.add(labelPreco);

		formulario.add(fieldPreco);

		janela.add(formulario, BorderLayout.CENTER);

		janela.add(buttonSalvar, BorderLayout.PAGE_END);

		janela.setResizable(false);

		instalarExit();
		instalarButtonSalvar();

	}

	private void instalarExit() {
		janela.addWindowListener(new WindowAdapter() {
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void exibir() {
		janela.setVisible(true);
		janela.pack();
	}

	public void exibirMensagem(String mensagem, boolean erro) {
		String cor = null;
		if (mensagem != null) {
			cor = (erro)? "red" : "green";
		}
		this.labelMensagens.setText(String.format("<html><div style='color: %s; font-size:12px'> %s </div></html>", 
				cor, mensagem));
		janela.pack();
	}

	private void instalarButtonSalvar() {
		buttonSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				/** 
				 * TODO 04
				 * 1. Elimine focos de acoplamento view para model presentes
				 * neste tratador de listener, nas linhas que se seguem.
				 * 
				 */
				String nomeProduto = fieldNome.getText();
				if (nomeProduto == null || nomeProduto.isEmpty()) {
					exibirMensagem("Informe um nome para o produto", true);
					return;
				}

				float valorProduto = 0;
				try {
					Float.parseFloat(fieldPreco.getText());
				} catch (Exception exception) {
					exibirMensagem("Preco deve usar ponto para separar casas decimais e"
							+ " conter somente numeros", true);
					return;
				}
				
				ControllerProduto controle = new ControllerProduto(nomeProduto,valorProduto);
				System.out.println(controle.getProduto());
			}
		});
		
	}
}
