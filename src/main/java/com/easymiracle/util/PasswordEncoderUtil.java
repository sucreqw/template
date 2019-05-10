package com.easymiracle.util;

import org.springframework.util.DigestUtils;

public class PasswordEncoderUtil {

    public static final String KEY="J297-ast_2-1";

    public static String encoder(String password){
        return DigestUtils.md5DigestAsHex((password+KEY).getBytes());
    }

    public static boolean eq(String password,String hexPassword){
        return hexPassword.equals(encoder(password));
    }

}
