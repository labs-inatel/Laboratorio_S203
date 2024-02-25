package avancado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {
	public static void main(String[] args){
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		
		engenhariasAtuais.add("Telecomunicacao");
		engenhariasAtuais.add("Biomedica");
		engenhariasAtuais.add("Computacao");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Producao");
		
		System.out.println("Engenharias atuais: " + engenhariasAtuais);
		
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		engenhariasFuturas.add("Mecanica");
		engenhariasFuturas.add("Mecatronica");
		
		System.out.println("Engenharias Futuras" + engenhariasFuturas);
		
		Collection<String> todas = new ArrayList<String>();
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as engenharias: " + todas);
		
		System.out.println("");
		System.out.println(">> Entendendo isEmpty() e size()");
		
		Collection<String> engenharias = new ArrayList<String>(todas);
		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Quantos elementos engenharias tem? " + engenharias.size());
		
		System.out.println("");
		System.out.println(">> Entendendo clear()");
		
		imprimirStatusDaColecao(engenharias);
		
		System.out.println("... invocando o clear");
		engenharias.clear();
		
		imprimirStatusDaColecao(engenharias);
	}
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if(engenharias.isEmpty()) {
			System.out.println("vazio");
		}else {
			System.out.println("tem elementos");
		}
		if(engenharias.size() == 0) {
			System.out.println("vazio");
		}else {
			System.out.println("tem elementos");
		}
	}
}
