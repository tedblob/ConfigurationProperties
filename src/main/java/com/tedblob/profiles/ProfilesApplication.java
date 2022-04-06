package com.tedblob.profiles;

import com.tedblob.profiles.configurations.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ProfilesApplication implements CommandLineRunner {

    //@Value("${server.port}")
    //String port;
	@Autowired
	AppProperties appProperties;

	private Logger logger = LoggerFactory.getLogger(ProfilesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(appProperties.getAddress());
		logger.info(appProperties.getError() != null ? appProperties.getError().getPath() : null);
		//logger.info(appProperties.getPort());
	}
}
