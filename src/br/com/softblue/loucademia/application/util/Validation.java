package br.com.softblue.loucademia.application.util;

public class Validation {

	//Verifica se o usuario preencheu alguma coisa
	public static void assertNotEmpty(Object obj) {
		if(obj instanceof String) {
			String s = (String) obj;
			if (StringUtils.isEmpty(s)) {
				//ERRO
				throw new ValidationException("O texto não pode ser nulo");
			}
		}
		
		if (obj == null) {
			//ERRO
			throw new ValidationException("Valor não pode ser nulo");
		}
	}
}
