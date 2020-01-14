package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

public class configTest {

}
//@Configuration
//@EnableCaching
//public class RedisCacheConfig {
//
//    @Value("${unavail.redis.address}")
//    private String redisAddress;
//
//    @Value("${unavail.redis.port}")
//    private Integer redisPort;
//
//    @Bean(name = "ratePlanByHotelCacheManager")
//    public CacheManager ratePlanByHotelCacheManager(RedisConnectionFactory redisConnectionFactory) {
//        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration
//                .defaultCacheConfig()
//                .entryTtl(Duration.ofMinutes(15L))
//                .disableCachingNullValues()
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer((new GenericJackson2JsonRedisSerializer())));
//        return RedisCacheManager
//                .builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory))
//                .cacheDefaults(redisCacheConfiguration)
//                .build();
//    }
//
//    @Bean
//    public RedisTemplate redisTemplate(LettuceConnectionFactory lettuceConnectionFactory) {
//        return new StringRedisTemplate(lettuceConnectionFactory);
//    }
//
//    @Bean("lettuceConnectionFactory")
//    public LettuceConnectionFactory lettuceConnectionFactory() {
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration(redisAddress, redisPort));
//    }
//}

