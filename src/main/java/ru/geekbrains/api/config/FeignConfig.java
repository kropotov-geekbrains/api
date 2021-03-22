package ru.geekbrains.api.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.api.controllers.ProductApi;

@Configuration
@EnableFeignClients(clients = {ProductApi.class})
public class FeignConfig {
}
