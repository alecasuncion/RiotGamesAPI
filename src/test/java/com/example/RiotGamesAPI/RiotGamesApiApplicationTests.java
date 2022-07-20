package com.example.RiotGamesAPI;

import com.controller.AccountInfoController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RiotGamesApiApplicationTests {

    @Autowired
    private AccountInfoController controller;

    @Test
    public void contextLoads() throws Exception {
    }

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void accountInfoTestGameNameTagLine() throws Exception {
        String result = this.restTemplate.getForObject("http://localhost:" + port + "/account/VeganFox/Beji",
                String.class);
        assertThat(result).contains("\"gameName\":\"Vegan Fox");
        assertThat(result).contains("\"tagLine\":\"Beji");
        assertThat(result).contains("\"puuid\":\"M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw");
    }

    @Test
    public void accountInfoTestPuuid() throws Exception {
        String result = this.restTemplate.getForObject("http://localhost:" + port + "/account/M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw",
                String.class);
        assertThat(result).contains("\"gameName\":\"Vegan Fox");
        assertThat(result).contains("\"tagLine\":\"Beji");
        assertThat(result).contains("\"puuid\":\"M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw");
    }
}
