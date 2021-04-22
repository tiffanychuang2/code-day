package codeday.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true) // Enables @PreAuthorize, etc.
public class Security extends WebSecurityConfigurerAdapter {
	

	
	//Add this bean to deal for the UserDetails
//	@Bean
//	public UserDetailsService userDetailsService() {
//		return new UserDetailsServiceImp();
//	}
	
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
		.authorizeRequests()
		.antMatchers("/admin/**", "/h2-console/**").hasRole("ADMIN") //see code in application.properties!
		.antMatchers("/css/**", "/js/**", "/images/**", "/h2-console/**", "/", "/home").permitAll()
		.anyRequest().authenticated()
		.and().csrf().ignoringAntMatchers("/h2-console/**")//don't apply CSRF protection to /h2-console
		.and()
	.formLogin()
		.loginPage("/login")
		.permitAll()
		.and()
	.logout()
		.logoutSuccessUrl("/login?logout")
		.permitAll()
		.and()
	.csrf().disable()  //cross-site-reference-forgery ("one click attack"/"session riding")
	.headers().frameOptions().disable();
}
    
//    @Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//
//	}
	/*
	 * @Override protected void configure(final AuthenticationManagerBuilder auth)
	 * throws Exception { auth.inMemoryAuthentication()
	 * .withUser("user").password(passwordEncoder().encode("user")).roles("USER")
	 * .and()
	 * .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN")
	 * ; }
	 */
    
  
    
}