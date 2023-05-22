import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        System.out.println();



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
        //palavras.sort(Comparator.comparingInt(String::length)); //Forma Oculta
        palavras.sort(Comparator.comparing(p -> p.length()));
        System.out.println(palavras);
        System.out.println();

        System.out.println("Ordenando por order alfabetica");
        palavras.sort(String::compareTo);
        System.out.println(palavras);
        System.out.println();


//        for (String p : palavras){
//            System.out.println(p);
//        } modo antigo!

//        Consumer<String> consumidor = new ImprimeNaLinha();
//            palavras.forEach(consumidor); //modo antgo!
        palavras.forEach((p) -> System.out.println(p));
        palavras.forEach(System.out::println); //igual ao de cima!


        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);




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
        palavras.sort(Comparator.comparingInt(String::length)); //method reference

        System.out.println("DEPOIS DO SORT");
//        palavras.forEach(p -> System.out.println(p));
        palavras.forEach(System.out::println);
        System.out.println();


        System.out.println("COM STREAM");
        System.out.println();
        System.out.println("ordenando pelo tamanho da string");
        palavras.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("ordenando por ordem alfabética");
        palavras.stream()
                .sorted(Comparator.comparing(p -> p.compareTo(p)))
                .forEach(System.out::println);






        // Interface Funcional = com apenas uma metodo abstrado(Ex: Consumer, Comparator)
        // forEach espera um Consumer como parametro;
        // Consumer espera uma expressão lambda e retorna void =  s -> {};
        // Comparator espera dois argumentos e retorna um Integer (s1, s2) -> {};
        // Function espera um Lambda s -> {};
        // Method References: String s -> s.length() = String::length;
    }
}

