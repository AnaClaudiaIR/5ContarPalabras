import java.util.HashMap;

public class MainHashMapCuenta {
    public static void main(String[] args) {
        String texto = "Un texto es una composición de signos codificados en un sistema de escritura que forma una unidad de sentido. \nTambién es una composición de caracteres imprimibles (con grafema) generados por un algoritmo de cifrado que, \naunque no tienen sentido para cualquier persona, sí puede ser descifrado por su destinatario original. \nEn otras palabras, un texto es un entramado de signos con una intención comunicativa que adquiere sentido en determinado contexto.";
        HashMap<String, Integer>contar = new HashMap<>();

        //Imprimir el texto que se va a mostrar
        System.out.println("---TEXTO---");
        System.out.println(texto);

        //Convertir el texto a un array --> Quitar los signos de puntuación, dividir el array por cada espacio y pasar a minúscula.
        String[] textoLimpio =  texto.toLowerCase().replaceAll("[.,()\\n]", "").split("\\s+");

        //Sumar 1 en caso de que este la palabra, si no empieza con 1.
        for (String palabra : textoLimpio) {
            if(contar.containsKey(palabra)){
                contar.put(palabra,contar.get(palabra)+1);
            } else{
                contar.put(palabra,1);
            }
        }
        System.out.println("\n---CONTAR---");
        System.out.println("Número de palabras: ");
        System.out.println(" ");
        for (String key : contar.keySet()) { //For each --> Para recorrer el mapa
            System.out.println("Palabra: "+ key);
            System.out.println("Veces que aparece: "+ contar.get(key));
            System.out.println("------------------");
        }
    }
}
