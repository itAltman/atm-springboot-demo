package me.atm.springboot.jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JettyApplication {
    public static void main(String[] args) {
        SpringApplication.run(JettyApplication.class, args);
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
        factory.setPort(9191);
        return factory;
    }
}
