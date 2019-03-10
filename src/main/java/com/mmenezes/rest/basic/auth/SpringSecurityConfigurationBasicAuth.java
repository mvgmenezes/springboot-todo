package com.mmenezes.rest.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//classe criada para sobrescrever o metodo do WebSecurityConfigurerAdapter e permitir o acesso do frontend passando 
//usuario e senha com configuracao basica do spring security, quando o frontend chama a API apresneta o erro 
//Access to XMLHttpRequest at 'http://localhost:8080/hello-world-bean/path-variable/mmenezes' from origin 'http://localhost:4200' has been blocked by CORS policy:
//Response to preflight request doesn't pass access control check: It does not have HTTP ok status.
@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//desabilitando o CSRF exceto para as opoes do reques para todas URLS
		
		http
			.csrf().disable() 
			.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				.anyRequest().authenticated()
				.and()
			//.formLogin().and()
			.httpBasic();
	}

}
