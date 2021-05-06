package br.com.aliceraltecnologia.processadorjob.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ScriptItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.aliceraltecnologia.processadorjob.dominio.Cliente;

@Configuration
public class ProcessadorScriptProcessorConfig {

	@Bean
	public ItemProcessor<Cliente, Cliente> processadorScriptProcessor() {
		return new ScriptItemProcessorBuilder<Cliente, Cliente>()
				.language("nashorn")
				.scriptSource(
					"var email = item.getEmail();" + 
					"var arquivoExiste = `ls | grep ${email}.txt`;" + 
					"if (!arquivoExiste) item; else null;")
				.build();
	}
}