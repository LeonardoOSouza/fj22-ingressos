package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobro(BigDecimal precoOriginal) {
		
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));
	}
	
	private BigDecimal trintaPorCentoSobre(BigDecimal preco) {
		return preco.multiply( new BigDecimal("0.3"));
	}

	@Override
	public String getDesconto() {
		// TODO Auto-generated method stub
		return "Desconto Banco";
	}

}
