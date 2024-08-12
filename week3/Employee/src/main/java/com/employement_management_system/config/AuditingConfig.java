package com.employement_management_system.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")

public class AuditingConfig {
    public AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl();
    }
}
    
}
