package com.cuongnm.oauth2.config;

import com.cuongnm.oauth2.config.properties.JwtProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("security")
public class SecurityProperties {
    private JwtProperties jwt;

    public JwtProperties getJwt() {
        return jwt;
    }

    public void setJwt(JwtProperties jwt) {
        this.jwt = jwt;
    }
}
