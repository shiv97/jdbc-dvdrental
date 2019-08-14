package com.example.start;
//package com.chpd.wms.local.domain.factory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
class StartApplication
{
	/*@SpringBootApplication (exclude = { DataSourceAutoConfiguration.class })
public class SpringbootApplication {
    SpringApplication.run(SpringbootApplication.class, args);
}*/
	//public static final String HOST = "jdbc:postgresql://localhost:5432/";
	//public static final String DB_NAME = "dvdrental";
	//public static final String USERNAME = "postgres";
	//public static final String PASSWORD = "postgres";
	public static void main(String[] args)
	{
		//SpringApplication.run(SpringbootApplication.class, args);
		SpringApplication.run(StartApplication.class, args);
	}

}