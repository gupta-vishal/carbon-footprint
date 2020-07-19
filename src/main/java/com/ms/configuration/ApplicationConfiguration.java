package com.ms.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.service.CarbonOffsetEstimateService;
import com.ms.service.external.cloverly.CarbonOffsetEstimateServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

    @Bean
    CarbonOffsetEstimateService carbonOffsetEstimatorService() {
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper());
        restTemplate.getMessageConverters().add(converter);
        return new CarbonOffsetEstimateServiceImpl(restTemplate);
    }
}
