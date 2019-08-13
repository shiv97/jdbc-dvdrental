package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	private final String url = "jdbc:postgresql://localhost/dvdrental";
	private final String user = "postgres";
	private final String password = "postgres";
	public Connection connect()
	{

		Connection conn = null;

		try
		{

			conn = DriverManager.getConnection(url, user, password);

			System.out.println("Connected to the PostgreSQL server successfully.");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}



		return conn;

	}
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		App app = new App();
		app.connect();
	}
}
