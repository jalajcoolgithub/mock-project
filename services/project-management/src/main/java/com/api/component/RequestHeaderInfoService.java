package com.api.component;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class RequestHeaderInfoService {

    private HttpServletRequest httpServletRequest;

    public String getHeaderInfo(String headerName) {
        try {
            if (httpServletRequest != null) {
                return httpServletRequest.getHeader(headerName);
            }
        } catch (Exception e) {
            System.out.println("Error found");
        }
        return "";
    }
}
