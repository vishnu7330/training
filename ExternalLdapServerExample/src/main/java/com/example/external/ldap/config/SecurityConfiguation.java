package com.example.external.ldap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.ldap.LdapBindAuthenticationManagerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.ldap.userdetails.DefaultLdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.PersonContextMapper;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguation {

	@Autowired
	Environment env;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin").hasAuthority("ROLE_ADMIN").antMatchers("/*")
				.hasAnyRole("ADMIN", "EDITOR", "PUBLISHER").anyRequest().authenticated().and().formLogin();
		return http.build();
	}

	@Bean
	public LdapContextSource contextSource() {
		LdapContextSource contextSource = new LdapContextSource();

		contextSource.setUrl(env.getRequiredProperty("ldap.url"));
		contextSource.setBase(env.getRequiredProperty("ldap.base"));
		contextSource.setUserDn(env.getRequiredProperty("ldap.username"));
		contextSource.setPassword(env.getRequiredProperty("ldap.password"));

		return contextSource;
	}

	@Bean
	AuthenticationManager ldapAuthenticationManager(BaseLdapPathContextSource contextSource,
			LdapAuthoritiesPopulator authorities) {

		LdapBindAuthenticationManagerFactory factory = new LdapBindAuthenticationManagerFactory(contextSource);
//		LdapPasswordComparisonAuthenticationManagerFactory factory = new LdapPasswordComparisonAuthenticationManagerFactory(
//				contextSource, new BCryptPasswordEncoder());
		factory.setUserDnPatterns("uid={0},ou=people");
//		factory.setPasswordAttribute("userPassword");
		factory.setUserDetailsContextMapper(new PersonContextMapper());
		factory.setLdapAuthoritiesPopulator(authorities);
		return factory.createAuthenticationManager();
	}

	@Bean
	LdapAuthoritiesPopulator authorities(BaseLdapPathContextSource contextSource) {
		String groupSearchBase = "ou=groups";
		DefaultLdapAuthoritiesPopulator authorities = new DefaultLdapAuthoritiesPopulator(contextSource,
				groupSearchBase);
		authorities.setGroupSearchFilter("member={0}");
		return authorities;
	}
	
//	https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/ldap.html

}
