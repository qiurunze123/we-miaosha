package com.geekq.miaosha;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.geekq.miaosha.mapper")
public class GeekQMainApplication {

    public static void main(String[] args) throws Exception {
        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://localhost:2181"));
        registry.register(URL.valueOf("override://0.0.0.0/com.geekq.api.service.GoodsService?category=configurators&dynamic=false&application=dubbo-consumer11&mock=fail:return+null"));
        SpringApplication.run(GeekQMainApplication.class, args);
    }










































}
