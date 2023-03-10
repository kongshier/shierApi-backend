package com.shier.shierapiclientsdk;

import com.shier.shierapiclientsdk.client.ShierClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shier 2023/2/13
 */
@Configuration
@ConfigurationProperties(value = "shier.client") // 读取配置
@Data
@ComponentScan // 扫包
public class ShierApiConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ShierClient shierClient() {
        return new ShierClient(accessKey, secretKey);
    }
}
