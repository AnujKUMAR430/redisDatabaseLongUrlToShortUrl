package com.stackfortech.urlShorteningService.repository;

import com.stackfortech.urlShorteningService.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository
{
    public Url findByShortLink(String shortLink);

    void delete(Url url);

    Url save(Url url);

}
