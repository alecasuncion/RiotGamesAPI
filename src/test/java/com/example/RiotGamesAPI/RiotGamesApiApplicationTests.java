package com.example.RiotGamesAPI;

import com.controller.AccountInfoController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RiotGamesApiApplicationTests {

    @Autowired
    private AccountInfoController controller;

    @Test
    public void contextLoads() throws Exception {
    }

    @Autowired
    public Environment env;

    @Autowired
    private TestRestTemplate restTemplate;

    protected HttpEntity<Object> createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", env.getProperty("riot.api.key"));
        System.out.println("APIKEY " + env.getProperty("riot.api.key"));
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<Object>(headers);
    }

    @Test
    public void accountInfoTestGameNameTagLine() throws Exception {
//        String result = this.restTemplate.exchange("http://localhost:" + port + "/account/VeganFox/Beji", HttpMethod.GET, createHeader(), String.class)
//        assertThat(result).contains("\"gameName\":\"Vegan Fox");
//        assertThat(result).contains("\"tagLine\":\"Beji");
//        assertThat(result).contains("\"puuid\":\"M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw");
    }

    @Test
    public void accountInfoTestPuuid() throws Exception {
//        String result = this.restTemplate.getForObject("http://localhost:" + port + "/account/M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw",
//                String.class);
//        String result = this.restTemplate.exchange("http://localhost:" + port + "/account/VeganFox/Beji", HttpMethod.GET, createHeader(), String.class)
//        assertThat(result).contains("\"gameName\":\"Vegan Fox");
//        assertThat(result).contains("\"tagLine\":\"Beji");
//        assertThat(result).contains("\"puuid\":\"M7iYm6hD1nE1Zgt1debgNKjGvk5fIhpBBiUwD5Gkf0vpSCgiNkLLh6MZJS7iCa80SABkDNX0BSeULw");
    }
}
