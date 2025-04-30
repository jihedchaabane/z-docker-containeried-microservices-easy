package com.chj.gr.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
/**
 * https://www.bezkoder.com/spring-boot-swagger-3/
 * https://github.com/bezkoder/spring-boot-swagger-3-example/tree/master
 * 
 * https://www.baeldung.com/java-spring-security-permit-swagger-ui
 */
@Configuration
public class OpenAPIConfig {

	@Value("${app.openapi.dev-url}")
  private String devUrl;
  
  @Value("${app.openapi.homol-url}")
  private String homolUrl;

  @Value("${app.openapi.prod-url}")
  private String prodUrl;

  @Bean
  public OpenAPI myOpenAPI() {
    Server devServer = new Server();
    devServer.setUrl(devUrl);
    devServer.setDescription("Server URL in Development environment");

    Server homolServer = new Server();
    homolServer.setUrl(homolUrl);
    homolServer.setDescription("Server URL in Homologation environment");
    
    Server prodServer = new Server();
    prodServer.setUrl(prodUrl);
    prodServer.setDescription("Server URL in Production environment");

    Contact contact = new Contact();
    contact.setEmail("jihed@gmail.com");
    contact.setName("Jihed");
    contact.setUrl("https://www.jihed.com");

    License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

    Info info = new Info()
        .title("Tutorial Management API")
        .version("1.0")
        .contact(contact)
        .description("This API exposes endpoints to manage bar.").termsOfService("https://www.jihed.com")
        .license(mitLicense);

    return new OpenAPI().info(info).servers(List.of(devServer, homolServer, prodServer));
  }
}
