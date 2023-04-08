import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");


//        Comparator<String> compador = new ComparadorPorTamanho();
//        Collections.sort(palavras, compador); modo antigo!


//        palavras.sort(new Comparator<String>() {
//            @Override
//            public int compare(String palavra1, String palavra2) {
//                if(palavra1.length() < palavra2.length())
//                    return -1;
//                if(palavra1.length() > palavra2.length())
//                    return 1;
//                return 0;
//            }
//        }); modo antigo!

        //METODO PARA ORDENAR DA STRING MENOR PARA A MAIOR:

        //palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length())); //FORMA HABITUAL
        palavras.sort(Comparator.comparingInt(String::length)); //Forma Oculta
        System.out.println(palavras);
        System.out.println("###############");


//        for (String p : palavras){
//            System.out.println(p);
//        } modo antigo!

//        Consumer<String> consumidor = new ImprimeNaLinha();
//            palavras.forEach(consumidor); //modo antgo!
        palavras.forEach((p) -> System.out.println(p));
        palavras.forEach(System.out::println); //igual ao de cima!

    }
}

//class ImprimeNaLinha implements Consumer<String>{
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}

//class ComparadorPorTamanho implements Comparator<String>{
//
//    @Override
//    public int compare(String palavra1, String palavra2) {
//        if(palavra1.length() < palavra2.length())
//            return -1;
//        if(palavra1.length() > palavra2.length())
//            return 1;
//        return 0;
//    }
//}

class OrdenaStringsLambda {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        System.out.println("ANTES DO SORT");
//        palavras.forEach(p -> System.out.println(p));
        palavras.forEach(System.out::println);
        System.out.println();

//        palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length())); modo trivial !
        palavras.sort(Comparator.comparingInt(String::length));

        System.out.println("DEPOIS DO SORT");
//        palavras.forEach(p -> System.out.println(p));
        palavras.forEach(System.out::println);
        System.out.println();

        // Consumer espera uma expressão lambda e retorna void =  s -> {};
        // Comparator espera dois argumentos e retorna um Integer (s1, s2) -> {};
    }
}

