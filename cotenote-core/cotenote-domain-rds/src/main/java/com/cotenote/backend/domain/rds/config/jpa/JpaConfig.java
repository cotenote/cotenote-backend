package com.cotenote.backend.domain.rds.config.jpa;

import com.cotenote.backend.domain.rds.RdsDomainRoot;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackageClasses = {RdsDomainRoot.class})
@EnableJpaRepositories(basePackageClasses = {RdsDomainRoot.class})
@EnableJpaAuditing
@Configuration
public class JpaConfig {

}
