package com.shier.shierinterface;


import com.shier.shierapiclientsdk.client.ShierClient;
import com.shier.shierapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@SpringBootTest
class ShierInterfaceApplicationTests {

    @Resource
    private ShierClient shierClient;

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        String result = shierClient.getNameByGet("GET-shier");
        String result1 = shierClient.getNameByPost("POST-shier");
        User user = new User();
        user.setUserName("JSON-shier");
        String byPostWithJson = shierClient.getNameByPostByJson(user);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(byPostWithJson);
    }
}
