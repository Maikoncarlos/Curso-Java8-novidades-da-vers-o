import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        Comparator<String> compador = new ComparadorPorTamanho();

//        Collections.sort(palavras, compador); modo antigo!
        palavras.sort(compador);
        System.out.println(palavras);
        System.out.println("###############");

//        for (String p : palavras){
//            System.out.println(p);
//        } modo antigo!

        Consumer<String> consumidor = new ImprimeNaLinha();
            palavras.forEach((p) -> System.out.println(p));
            palavras.forEach(System.out::println); //igual ao de cima!

    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String palavra1, String palavra2) {
        if(palavra1.length() < palavra2.length())
            return -1;
        if(palavra1.length() > palavra2.length())
            return 1;
        return 0;
    }
}
