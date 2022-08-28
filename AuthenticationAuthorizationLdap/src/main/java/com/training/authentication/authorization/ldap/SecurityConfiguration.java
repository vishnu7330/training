package com.training.authentication.authorization.ldap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.ldap.EmbeddedLdapServerContextSourceFactoryBean;
import org.springframework.security.config.ldap.LdapPasswordComparisonAuthenticationManagerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.ldap.userdetails.PersonContextMapper;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	@Order(1)
	public SecurityFilterChain adminFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> authz.antMatchers("/admin").authenticated()).formLogin();
		return http.build();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authz) -> authz.anyRequest().authenticated()).formLogin();
		return http.build();
	}

	@Bean
	public EmbeddedLdapServerContextSourceFactoryBean contextSourceFactoryBean() {
		EmbeddedLdapServerContextSourceFactoryBean contextSourceFactoryBean = EmbeddedLdapServerContextSourceFactoryBean
				.fromEmbeddedLdapServer();
		contextSourceFactoryBean.setPort(0);
		return contextSourceFactoryBean;
	}

	@Bean
	AuthenticationManager ldapAuthenticationManager(BaseLdapPathContextSource contextSource) {
//		LdapBindAuthenticationManagerFactory factory = new LdapBindAuthenticationManagerFactory(contextSource);
		LdapPasswordComparisonAuthenticationManagerFactory factory = new LdapPasswordComparisonAuthenticationManagerFactory(
				contextSource, new BCryptPasswordEncoder());
		factory.setUserDnPatterns("uid={0},ou=people");
		factory.setUserDetailsContextMapper(new PersonContextMapper());
		return factory.createAuthenticationManager();
	}

}