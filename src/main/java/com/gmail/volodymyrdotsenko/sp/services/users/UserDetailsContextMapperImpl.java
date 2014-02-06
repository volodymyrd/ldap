package com.gmail.volodymyrdotsenko.sp.services.users;

import java.util.Collection;

import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

public class UserDetailsContextMapperImpl implements UserDetailsContextMapper {

	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx,
			String username, Collection<? extends GrantedAuthority> authorities) {
		
		System.out.println(username);
		
		return new User(username, "", authorities);
	}

	@Override
	public void mapUserToContext(UserDetails user, DirContextAdapter ctx) {
		
	}	
}