package src.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;

	private List<ItemVenda> itensVenda = new ArrayList<>();
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	/*
	 * TODO 01
	 * 1. Este metodo presume a guarda de todos ItemVenda, mas assume
	 * que os objetos itens sao criados fora, por quem eh cliente desta
	 * classe Venda. Esta classe teria o poder de criar esses itens em si?
	 * R/ sim
	 * 
	 * 2. Para avaliar isso, veja se ela eh especialista na informacao
	 * para inicializar esses itens logo que criados/instanciados e/ou
	 * se esta classe os aglutinam/ajuntas dentro de si.
	 * 
	 * 3. Anote qual o principio GRASP que você considerou, caso tenha refatorado
	 * este codigo e explique como sua solucao trouxe beneficios ao design.
	 * R/ Criador
	 */
	public void addItemVenda(int quantidade,Produto produto) {
		ItemVenda itemVenda = new ItemVenda();
		
		itemVenda.setQuantidade(quantidade);
		itemVenda.setProduto(produto);
		itensVenda.add(itemVenda);		
	}

	public float getTotal() {
		float total = 0;
		for (ItemVenda item : this.itensVenda) {
			total += item.getSubtotal();
		}
		System.out.println(total);
		return total;
	}

	/*
	 * TODO 02
	 * 1. Esta classe eh a especialista no conjunto de informacoes para
	 * estar dispondo deste metodo? 
	 * 
	 * 2. Para avaliar isso, veja quem seria a classe mais especializada e refatore
	 * este codigo, caso quem venha a ofertar este metodo seja outra classe.
	 * Verifique tambem o grau de acoplamento desta classe com o codigo atual
	 * e depois, caso o tenha refatorado (quantidade de dependencia com
	 * outras classes de objetos). 
	 * 
	 * 3. Anote qual o principio GRASP que você considerou, caso tenha refatorado
	 * este codigo e explique como sua solucao trouxe beneficios ao design.
	 * Na verdade seriam 2 principios aqui, ok?...
	 */
	

	/**
	 * TODO 03
	 * 1. Este metodo afeta a coesao desta classe Venda? Devemos deixa-lo aqui?
	 * Num primeiro momento, podemos ate pensar que esta classe e a especialista
	 * na informacao para estar implementando envio de email da nota fiscal, mas 
	 * sera que tudo que se derivar dos dados aqui contidos for programado
	 * aqui, não incorreremos num inchamento desta classe? Sera que todas as 
	 * classes clientes desta classe Venda lhe pedirao para enviar nota fiscal?
	 * 
	 * 2. Para avaliar isso, considere se este metodo se encaixa no proposito/objetivo
	 * de coesao funcional desta classe Venda, que eh o de apenas representar os dados a
	 * serem abstraidos de uma compra (do modelo de negocios que se esta informatizando)
	 * na memoria e somente.
	 * 
	 * 3. Anote qual o principio GRASP que você considerou, caso tenha refatorado
	 * este codigo e explique como sua solucao trouxe beneficios ao design.
	 * 
	 *  
	 */
	
}


