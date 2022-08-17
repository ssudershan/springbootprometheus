package com.example.demo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomMetricConfiguration {

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> addCustomTags(){

        return (registry -> registry.config().commonTags("region", "us-east-1").commonTags("server","dev"));
    }
}
