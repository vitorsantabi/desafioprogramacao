import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
 #@author José Vitor Santana do Nascimento
 */
public class Senha2 {
    public static void main(String[] args) {
        String palavra;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a  palavra: ");
        palavra = s.next();

        anagrama(palavra);
    }
    static void anagrama(String palavra) {
        int pares = 0;

        HashMap<String, Integer> letrasPalava = new HashMap<>();

        for (int i = 0; i <= palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {

                char[] letra = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(letra);
                String subletra = new String(letra);


                if (letrasPalava.containsKey(subletra)) {
                    letrasPalava.put(subletra, letrasPalava.get(subletra) + 1);
                } else {
                    letrasPalava.put(subletra, 1);
                }
            }
        }


        for (String cont : letrasPalava.keySet()) {
            int i = letrasPalava.get(cont);
            pares += (i * (i - 1)) / 2;
        }
        System.out.print("A quantidade de Anagramas na Palavra é : " + pares);
    }
}