
package com.surya.cia2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
            <html>
                <head>
                    <title>CIA 2 - CI/CD Project</title>
                </head>
                <body style="font-family: Arial; text-align: center;
                             margin-top: 100px; background: #eef2ff;">

                    <h1>Welcome to CIA 2 Cloud CI/CD Project!</h1>
                    <p>Version 2.0 - Automatically deployed through GitHub Actions!</p>

                    <h2>Hello, Surya!</h2>

                    <p>Our Spring Boot application is running!</p>

                    <p>Build Tool: Maven</p>
                    <p>Containerization: Docker</p>
                    <p>Orchestration: Kubernetes</p>

                    <h3>Status: SUCCESS</h3>

                </body>
            </html>
            """;
    }
}
