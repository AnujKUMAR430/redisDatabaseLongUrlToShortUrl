package com.stackfortech.urlShorteningService.repository;

import com.stackfortech.urlShorteningService.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UrlRepositoryImpl implements UrlRepository{
    @Autowired
    private RedisTemplate redisTemplate;
    private static final String KEY = "USER";
    @Override
    public Url findByShortLink(String shortLink) {
        Url url = (Url) redisTemplate.opsForHash().get(KEY, shortLink);
        return url;
    }

    @Override
    public void delete(Url url) {
        redisTemplate.opsForHash().delete(KEY, url.getShortLink());
    }

    @Override
    public Url save(Url url) {

        try {
            System.out.println("url = " + url);
            redisTemplate.opsForHash().put(KEY, url.getShortLink(), url);
            System.out.println("url = " + url);
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
