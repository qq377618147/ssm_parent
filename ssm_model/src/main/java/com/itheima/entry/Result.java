package com.itheima.entry;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author yuzhang
 * @version 1.0
 * @date 2020/8/17/0017 15:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Result implements Serializable {
    private boolean flag;//执行结果，true为执行成功 false为执行失败
    private String message;//返回结果信息
    private Object result;//返回数据
    public Result(boolean flag,String message){
        this.flag = flag;
        this.message = message;
    }
}
