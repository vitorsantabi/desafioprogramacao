import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 #@author José Vitor Santana do Nascimento
 */
public class escada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> degraus = new ArrayList<>();
        System.out.print("Digite a quantidade de vezes: ");
        int qtdDegraus = s.nextInt();
        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }
        for (String d : degraus) {
            System.out.println(d);
        }
    }
}
