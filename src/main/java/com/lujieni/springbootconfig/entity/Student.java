package com.lujieni.springbootconfig.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Student {
    private Integer age=27;
    private String name="王虎";
    /*
     @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
     @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    */
    private Date date;
}
