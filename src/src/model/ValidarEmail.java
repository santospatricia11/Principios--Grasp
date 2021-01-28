package src.model;

import src.view.TelaCadastroProduto;

public class ValidarEmail {
	
	private EnviarNotaFiscalPorEmail enviar;
	private TelaCadastroProduto tela;
	
	public void verificarEmail(){
		
		if (enviar.enviarNotaFiscalPorEmail()) {
			tela.exibirMensagem("Venda registrada com sucesso!", false);
		}else {
				tela.exibirMensagem("Erro ao registrar venda (nao foi possivel "
						+ "contatar o servidor de email para envio da nota fiscal "
						+ "ou login e senha do servidor estao incorretos)", true);
		
		}

	}
		
}
