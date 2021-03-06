package com.mtdhb.api.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mtdhb.api.constant.ThirdPartyApplication;

import lombok.Data;

@Data
@Entity
public class CookieCount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * TODO 冗余字段
     */
    @Enumerated
    private ThirdPartyApplication application;
    private String openId;
    /**
     * TODO 冗余字段
     */
    private Long userId;
    private Long cookieId;
    private Long receivingId;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;

}
