package br.com.aliceraltecnologia.processadorjob.processor;

import org.springframework.batch.item.ItemProcessor;

import br.com.aliceraltecnologia.processadorjob.dominio.Transacao;

public class TransacaoProcessor implements ItemProcessor<Transacao, Transacao> {

	@Override
	public Transacao process(Transacao transacao) throws Exception {
		System.out.println(String.format("\nAplicando regras de negócio na transação %s", transacao.getId()));
		return transacao;
	}

}
