package com.GTasterix.OMR.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }
}
