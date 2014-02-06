package com.gmail.volodymyrdotsenko.ldap.service.authentication;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class MyUsernamePasswordAuthFilter extends
		UsernamePasswordAuthenticationFilter {
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, filterChain,
				authResult);
		String username = super.obtainUsername(request);
		// do something with username
	}
}