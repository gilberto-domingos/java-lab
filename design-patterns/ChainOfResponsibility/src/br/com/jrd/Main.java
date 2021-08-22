package br.com.jrd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.jrd.middleware.CheckPermissionMiddleware;
import br.com.jrd.middleware.CheckUserMiddleware;
import br.com.jrd.middleware.Middleware;
import br.com.jrd.server.Server;
	
public class Main {
	
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Server server;
	
	public static void init() {
		server = new Server();
		server.registerUser("domingoshot@hotmail.com", "58544oiu%");
		server.registerUser("user@hotmail.com", "123456");
		
		Middleware middleware = new CheckUserMiddleware(server);
		middleware.linkWith(new CheckPermissionMiddleware());
		
		server.setMiddleware(middleware);
	}
	

	public static void main(String[] args) throws IOException {

		init();
		
		boolean done;
		
		do {
			System.out.println("Digite o seu email : ");
			String email = reader.readLine();
			System.out.println("Digite a sua senha : ");
			String password = reader.readLine();
			done = server.logIn(email, password);
		} while (!done);
		
	}

}

















