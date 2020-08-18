package com.itheima.pojo;

import lombok.*;

import java.util.Date;

/**
 * @author yuzhang
 * @version 1.0
 * @date 2020/8/16/0016 19:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
