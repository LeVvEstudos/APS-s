import java.util.Scanner;

public class SistemaSeguranca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE SEGURANÇA DIGITAL ===");

        // Entrada das senhas
        System.out.print("Digite a senha principal: ");
        String senhaPrincipal = entrada.nextLine();

        System.out.print("Digite a senha da biometria: ");
        String senhaBiometria = entrada.nextLine();

        System.out.print("Digite a senha do administrador: ");
        String senhaAdmin = entrada.nextLine();

        // Verificações lógicas
        boolean p = senhaPrincipal.equals("seguranca123");
        boolean q = senhaBiometria.equals("bio456");
        boolean r = senhaAdmin.equals("admin789");

        /*
         * Proposição:
         * (P v Q) ^ R
         *
         * O acesso será permitido se:
         * (senha principal OU biometria corretas)
         * E a senha do administrador estiver correta
         */

        boolean acesso = (p || q) && r;

        // Resultado do sistema
        System.out.println("\n=== RESULTADO ===");

        if (acesso) {
            System.out.println("Acesso permitido ao sistema.");
        } else {
            System.out.println("Acesso bloqueado.");
        }

        // Exibição da proposição
        System.out.println("\nProposição composta:");
        System.out.println("(P v Q) ^ R");

        // Exibição da tabela-verdade
        System.out.println("\n=== TABELA-VERDADE ===");
        System.out.println("P\tQ\tR\t(P v Q) ^ R");

        boolean[] valores = {true, false};// Array que armazena o true e false

        // Faz um loop para valor p, q, r
        for (boolean vp : valores) {
            for (boolean vq : valores) {
                for (boolean vr : valores) {

                    boolean resultado = (vp || vq) && vr;// É o final da tabela

                    System.out.println(
                            valor(vp) + "\t" +// Todas as combinações de p
                            valor(vq) + "\t" +// Todas as combinações de q
                            valor(vr) + "\t" +// Todas as combinações de r
                            valor(resultado)
                    );
                }
            }
        }

        entrada.close();
    }

    // Método para converter verdadeiro/falso em V/F
    public static String valor(boolean b) {

        if (b) {
            return "V";
        } else {
            return "F";
        }
    }
}