package src.controller;

import java.util.Calendar;

import src.model.Produto;
import src.model.ValidarEmail;
import src.model.Venda;

public class ControllerProduto {

	/* 
	 * TODO 04
	 * 
	 * 1. Implemente os metodos que este controlador deve intermediar
	 * pelos eventos do usuario na classe TelaCadastroProduto (view), 
	 * acionando funcionalidades na classe Produto (model) e, eventualmente,
	 * exibindo resultado desses acionamentos de volta na view. 
	 * 
	 * 2. Para detectar melhor o que este controler deve prover como métodos, 
	 * veja os listeners dispostos na classe TelaCadastroProduto que estão se 
	 * acoplando diretamente com objetos da camada model.
	 *  
	 * 3. Verifique se este controlador pode manter referencias
	 * (como atributos desta classe) para objetos view e /ou model envolvidos.
	 * Se puder, declare-os e utilize-os nas implementacoes dos metodos deste
	 * controlador.
	 * 
	 * */
	
	private Produto produto = new Produto();
	
	private Venda venda = new Venda();
	
	private ValidarEmail validaEmail = new ValidarEmail();
	
	
	public ControllerProduto(String nomeDeProduto, float valor){
		this.criarProdudo(nomeDeProduto, valor);
		this.CriarVenda();
		System.out.println("Contrutor ok");
	}
	
	public ControllerProduto() {
		
	}
	
	public void criarProdudo(String nomeDeProduto, float valor){
		produto.setNome(nomeDeProduto);
		produto.setPreco(valor);
	}

	public void CriarVenda(){
		venda.addItemVenda(1, produto);
		venda.setData(Calendar.getInstance().getTime());
		
	}
	
	public Produto getProduto(){
		return produto;
	}
	
	

}
