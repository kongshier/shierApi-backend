package com.shier.project;

import com.shier.project.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@EnableDubbo
@Service
public class ShierApiGetawayApplication {

    @DubboReference
    private RpcDemoService rpcDemoService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShierApiGetawayApplication.class, args);
        ShierApiGetawayApplication contextBean = context.getBean(ShierApiGetawayApplication.class);
        String result1 = contextBean.doSayHello("shier1");
        String result2 = contextBean.doSayHello2("shier22");
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    // @Bean
    // public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("to_shier", r -> r.path("/baidu")
    //                     .uri("http://www.baidu.com"))
    //             .build();
    //
    // }

    public String doSayHello(String name) {
        return rpcDemoService.sayHello(name);
    }

    public String doSayHello2(String name) {
        return rpcDemoService.sayHello(name);
    }
}
