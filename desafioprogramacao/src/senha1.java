import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 #@author José Vitor Santana do Nascimento
 */
public class senha1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(".".repeat(50));
        System.out.print("Nome do Usuario : ");
        String nome = s.next();

        System.out.println(".".repeat(50));
        System.out.println("Atencao sua Senha deve conter os sequintes requisitos a baixo !:\n"
                + " # Possuir no minimo 6 caracteres.\n"
                + " # Conter no minimo 1 numero.\n"
                + " # Conter no minimo 1 letra em minusculo.\n"
                + " # Conter no minimo 1 letra em Maiusculo.\n"
                + " # Conter no minimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-+");

        String senha;
        do {
            System.out.println(".".repeat(50));
            System.out.print("Digite sua Senha : ");
            senha = s.next();
        } while (!validaSenha(senha, nome));

        s.close();
    }

    public static boolean validaSenha(String senha, String nome) {

        if (senha == null) {
            return false;
        }
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";

        Matcher m = Pattern.compile(regex).matcher(senha);
        boolean respo = m.matches();

        System.out.println(".".repeat(3));
        if (respo == true)
            System.out.print("Ola! " + nome + ", sua Senha é valida, acesso liberado !!.");
        else if (respo == false)
            System.out.println("Senha muito fraca, siga as instruções de senha acima!.");
        return respo;
    }

}
