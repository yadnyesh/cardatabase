package io.yadnyesh.cardatabase.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class AuthenticationService {

    static final long EXPIRATIONTIME = 864_000_00;
    static final String SIGNINGKEY = "SecretKey";
    static final String PREFIX = "Bearer";

    //Add Token to the Authorization Header
    static public void addToken(HttpServletResponse httpServletResponse, String userName) {
        String JwtToken = Jwts.builder().setSubject(userName)
                        .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                        .signWith(SignatureAlgorithm.ES512, SIGNINGKEY).compact();
        httpServletResponse.addHeader("Authorization", PREFIX + " " + JwtToken);
        httpServletResponse.addHeader("Access-Control-Expose-Headers", "Authorization");
    }


}
