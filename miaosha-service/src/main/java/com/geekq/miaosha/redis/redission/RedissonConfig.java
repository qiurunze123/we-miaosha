package com.geekq.miaosha.redis.redission;

import com.geekq.miaosha.service.GoodsService;
import com.geekq.miaosha.service.LoginInfoService;
import com.geekq.miasha.vo.GoodsVo;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 *
 *
 * redisson 邱润泽
 *
 */
@Configuration
public class RedissonConfig implements LoginInfoService {

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private String port;

    @Value("${redis.password}")
    private String password;

    @Autowired
    GoodsService goodsService;

    @Bean
    public RedissonClient getRedisson(){
//        List<GoodsVo> goodsList = goodsService.listGoodsVo();
//        if (goodsList == null) {
//        }
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + host + ":" + port).setPassword(password);
        //添加主从配置
//        config.useMasterSlaveServers().setMasterAddress("").setPassword("").addSlaveAddress(new String[]{"",""});

        return Redisson.create(config);
    }

    @Override
    @Bean
    public String checkName() {
        return null;
    }
}