package com.stackfortech.urlShorteningService.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Url implements Serializable
{
    private String originalUrl;
    private String shortLink;
    private Integer count = 0;
//    private LocalDateTime creationDate;
//    private LocalDateTime expirationDate;

}
