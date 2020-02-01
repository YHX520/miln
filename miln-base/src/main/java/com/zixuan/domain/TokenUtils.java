package com.zixuan.domain;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenUtils {

    public static String create(User user){
        String token="";
        token= JWT.create()
                .withClaim("username", user.getUserName())
                .withClaim("userId",user.getUserId())
                .withClaim("generatetime",System.currentTimeMillis())
                .withClaim("exptime",1000*1*60*60)
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}