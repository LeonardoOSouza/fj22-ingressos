package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobro(BigDecimal precoOriginal) {
		
		return precoOriginal;
	}

	@Override
	public String getDesconto() {
		
		return "Normal";
	}

}
