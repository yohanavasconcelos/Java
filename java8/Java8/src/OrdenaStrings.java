import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Collections.sort(palavras, comparador);


		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(s -> s.length());
//		palavras.sort(comparador);
//	    é a mesma coisa que a de baixo
		
//		Function<String, Integer> funcao = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		};
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
//		tbm é igual
//		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
	    System.out.println(palavras);
		
//        for (String p : palavras) {
//			System.out.println(p);
//		}

		palavras.forEach( System.out::println);

	}

}


