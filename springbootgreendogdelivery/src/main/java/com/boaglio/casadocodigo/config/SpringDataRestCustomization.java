package com.boaglio.casadocodigo.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

import com.boaglio.casadocodigo.domain.Item;
import com.boaglio.casadocodigo.repository.ClienteRepository;



@Component
public class SpringDataRestCustomization implements RepositoryRestConfigurer
{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Item.class,ClienteRepository.class);
	}
}

