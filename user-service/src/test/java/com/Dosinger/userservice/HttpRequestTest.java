package com.Dosinger.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    
    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate template;

    //To test the Http Request
    @Test
    public void greetingShouldReturnHello() throws Exception{
       assertThat(this.template.getForObject("http://localhost:"+port+"/user/home", String.class))
       .contains("Hello"); 
    }

}
