package io.yadnyesh.cardatabase.service;

import javax.servlet.http.HttpServletResponse;

public class AuthenticationService {

    static final long EXPIRATIONTIME = 864_000_00;
    static final String SIGNINGKEY = "SecretKey";
    static final String PREFIX = "Bearer";

    //Add Token to the Authorization Header
    static public void addToken(HttpServletResponse httpServletResponse, String userName) {
    }
}
