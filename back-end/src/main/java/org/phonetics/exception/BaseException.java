package org.phonetics.exception;

import lombok.Data;

/**
 * @description:
 * @Author: zzz
 * @CreateTime: 2023-11-06 22:38
 */
@Data
public class BaseException extends RuntimeException {

    String msg;

    public BaseException(String msg){
        this.msg = msg;
    }

}
