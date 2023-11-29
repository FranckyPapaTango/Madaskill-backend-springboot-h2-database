package com.h2.db.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import tech.jhipster.config.JHipsterProperties;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Value;


@Configuration
public class MailConfig {
    @Value("${jhipster.mail.host}")
    private String mailHost;

    @Value("${jhipster.mail.port}")
    private int mailPort;

    private final JHipsterProperties jHipsterProperties;

    public MailConfig(JHipsterProperties jHipsterProperties) {
        this.jHipsterProperties = jHipsterProperties;
    }

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(mailHost);
        mailSender.setPort(mailPort);

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "false");

        mailSender.setJavaMailProperties(props);  // Important: Set the properties on the mailSender

        return mailSender;
    }
}


