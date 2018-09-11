package com.sb.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootWebApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
		logger.debug("ROOT LEVEL");
	}
	/*@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	  TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
	      @Override
	      protected void postProcessContext(Context context) {
	        SecurityConstraint securityConstraint = new SecurityConstraint();
	        securityConstraint.setUserConstraint("CONFIDENTIAL");
	        SecurityCollection collection = new SecurityCollection();
	        collection.addPattern("/*");
	        securityConstraint.addCollection(collection);
	        context.addConstraint(securityConstraint);
	      }
	    };
	   
	  tomcat.addAdditionalTomcatConnectors(redirectConnector());
	  return tomcat;
	}
	 
	private Connector redirectConnector() {
	  Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
	  connector.setScheme("http");
	  connector.setPort(9090);
	  connector.setSecure(false);
	  connector.setRedirectPort(8443);
	   
	  return connector;
	}*/
}