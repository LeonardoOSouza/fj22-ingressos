package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class DescontoParaEstudante implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobro(BigDecimal precoOriginal) {
		
		return precoOriginal.divide(new BigDecimal("2"));
	}

	@Override
	public String getDesconto() {
		// TODO Auto-generated method stub
		return "Desconto Estudante";
	}

}
