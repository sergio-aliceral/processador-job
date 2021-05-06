package br.com.aliceraltecnologia.processadorjob.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.aliceraltecnologia.processadorjob.dominio.Pessoa;

@Configuration
public class ProcessadorClassifierProcessorConfig {
	
	@Bean
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ItemProcessor processadorClassifierProcessor() {
		return new ClassifierCompositeItemProcessorBuilder<>()
				.classifier(classifier())
				.build();
	}

	@SuppressWarnings({ "rawtypes", "serial" })
	private Classifier classifier() {
		return new Classifier<Object, ItemProcessor>() {

			@Override
			public ItemProcessor classify(Object objeto) {
				if (objeto instanceof Pessoa)
					return new PessoaProcessor();
				else
					return new TransacaoProcessor();
			}

		};
	}
}
