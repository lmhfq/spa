package com.lmh.spa.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class UserAddDTO implements Serializable {

    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;


}
