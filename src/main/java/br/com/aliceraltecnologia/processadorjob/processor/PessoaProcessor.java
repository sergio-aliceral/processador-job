package br.com.aliceraltecnologia.processadorjob.processor;

import org.springframework.batch.item.ItemProcessor;

import br.com.aliceraltecnologia.processadorjob.dominio.Pessoa;

public class PessoaProcessor implements ItemProcessor<Pessoa, Pessoa> {

	@Override
	public Pessoa process(Pessoa pessoa) throws Exception {
		System.out.println(String.format("\nAplicando regras de negócio na pessoa %s", pessoa.getEmail()));
		return pessoa;
	}

}
