
package com.surya.cia2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Cia2CicdApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void homePageContainsWelcomeMessage() {

        HelloController controller = new HelloController();

        String response = controller.home();

        assertTrue(response.contains("Welcome to CIA 2 Cloud CI/CD Project!"));

        assertTrue(response.contains("Hello, Surya!"));
    }
}
