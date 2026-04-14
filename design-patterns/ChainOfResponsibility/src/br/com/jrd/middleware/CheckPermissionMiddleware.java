package br.com.jrd.middleware;

public class CheckPermissionMiddleware extends Middleware {

	@Override
	public boolean check(String email, String password) {
		if (email.equals("domingoshot@hotmai.com")) {
			System.out.println("Bem vindo administrador ! ");
			return true;
		}

		System.out.println("Bem vindo !");
		return checkNext(email, password);
	}

}
