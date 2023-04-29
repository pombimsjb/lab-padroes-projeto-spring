package com.pombimsjb.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Giancarlo - pombimsjb
 * Projeto criado diretamente no IntelliJ
 * Gerado com os seguintes módulos:
 * - Spring Data JPA;
 * - Spring Web;
 * - H2 Database;
 * - OpenFeign.
 * Gerado conforme instruções em curso.
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
