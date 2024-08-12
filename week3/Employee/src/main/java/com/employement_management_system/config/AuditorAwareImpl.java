package com.employement_management_system.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {
    @SuppressWarnings("null")
    @Override
    public Optional<String> getCurrentAuditor(){
        return Optional.ofNullable("System");
    }
}
