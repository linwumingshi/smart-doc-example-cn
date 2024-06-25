package com.power.doc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.List;

/**
 * token 测试实体
 *
 * @author linwumingshi
 */
@Data
public class TokenInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 访问令牌过期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Instant expiration;

    /**
     * 访问令牌过期时间
     */
    private Instant expirationTwo;

    /**
     * 访问令牌发放时间
     */
    private LocalDateTime issuedAt;

    /**
     * 测试 LocalDate 访问令牌发放时间
     */
    private LocalDate testIssuedAt;

    /**
     * 访问权限 EnumSet
     */
    private EnumSet<Access> access;

    /**
     * 测试枚举
     */
    private Access test;

    /**
     * 访问权限 list
     */
    private List<Access> list;

    /**
     * 访问权限
     */
    public enum Access {
        /**
         * 读
         */
        READ,
        /**
         * 写
         */
        WRITE
    }
}
