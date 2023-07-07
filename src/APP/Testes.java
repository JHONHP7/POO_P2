package APP;

import java.util.HashMap;
import java.util.Map;

import entities.Homem;

public class Testes {

	public static void main(String[] args) {
		
		Homem omi = new Homem("Jhonatan");
		
		Map<String, String> dddRegiao = new HashMap<>();
		
		dddRegiao.put("Rj","21");
		dddRegiao.put("SP","11");
		
		for(String chave: dddRegiao.keySet()) {
			String valor = dddRegiao.get(chave);
			System.out.println(chave + " : "+valor);
		}
		 int dividend = 10;
	        int divisor = 0;

	        try {
	            int result = dividend / divisor;
	            System.out.println("Resultado: " + result);
	        } catch (Exception e) {
	            System.out.println("Erro: Divisão por zero!");
	        }
		
		
	}
}
