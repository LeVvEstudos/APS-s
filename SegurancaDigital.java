import java.util.Scanner;


public class SegurancaDigital{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;
        while(opcao != 5){
            System.out.println("===== GUIA DE SEGURANÇA DIGITAL =====");
            System.out.println("1 - Segurança de Senhas");
            System.out.println("2 - Golpes Online");
            System.out.println("3 - Quiz de Segurança");
            System.out.println("4 - Checklist Final");
            System.out.println("5 - Sair");
            opcao = leitor.nextInt();

            switch(opcao){

    case 1:
    System.out.println("\n===== SEGURANÇA DE SENHAS =====");

    System.out.println("1. Use letras maiúsculas e minúsculas.");
    System.out.println("2. Utilize números e caracteres especiais.");
    System.out.println("3. Evite datas de nascimento.");
    System.out.println("4. Nunca reutilize a mesma senha.");
    System.out.println("5. Troque suas senhas periodicamente.");
    System.out.println("6. Não compartilhe suas senhas.");
    System.out.println("7. Use autenticação em duas etapas.");
    System.out.println("8. Evite salvar senhas em computadores públicos.");
    System.out.println("9. Utilize gerenciadores de senhas.");
    System.out.println("10. Quanto maior a senha, mais segura ela será.");
    break;

    case 2:
    System.out.println("\n===== GOLPES ONLINE =====");

    System.out.println("1. Nunca clique em links desconhecidos.");
    System.out.println("2. Desconfie de promoções muito exageradas.");
    System.out.println("3. Não compartilhe códigos recebidos por SMS.");
    System.out.println("4. Verifique se o site possui HTTPS.");
    System.out.println("5. Nunca informe dados bancários em mensagens.");
    System.out.println("6. Golpistas costumam usar senso de urgência.");
    System.out.println("7. Verifique o remetente dos e-mails.");
    System.out.println("8. Evite baixar arquivos suspeitos.");
    System.out.println("9. Não confie em perfis desconhecidos.");
    System.out.println("10. Sempre confirme informações em canais oficiais.");
    break;

    case 3:
    System.out.println("\n===== QUIZ DE SEGURANÇA =====");

    int pontos = 0;

    // PERGUNTA 1
    System.out.println("\n1) Qual dessas senhas é mais segura?");
    System.out.println("1 - 123456");
    System.out.println("2 - senha123");
    System.out.println("3 - Gato@2026");

    int resposta1 = leitor.nextInt();

    if (resposta1 == 3) {
        System.out.println("Correto!");
        pontos++;
    } else {
        System.out.println("Errado! Senhas fortes possuem letras, números e símbolos.");
    }

    // PERGUNTA 2
    System.out.println("\n2) O que fazer ao receber um link suspeito?");
    System.out.println("1 - Clicar rapidamente");
    System.out.println("2 - Ignorar ou verificar a origem");
    System.out.println("3 - Compartilhar com amigos");

    int resposta2 = leitor.nextInt();

    if (resposta2 == 2) {
        System.out.println("Correto!");
        pontos++;
    } else {
        System.out.println("Errado! Nunca clique em links suspeitos.");
    }

    // RESULTADO FINAL
    System.out.println("\nVocê fez " + pontos + " ponto(s)!");

    if (pontos == 2) {
        System.out.println("Excelente! Você entende bem sobre segurança digital.");
    } else if (pontos == 1) {
        System.out.println("Bom trabalho! Mas ainda pode melhorar.");
    } else {
        System.out.println("Atenção! Você precisa aprender mais sobre segurança digital.");
    }

    break;

                case 4:
    System.out.println("\n===== CHECKLIST DE SEGURANÇA DIGITAL =====");

    int seguranca = 0;

    // PERGUNTA 1
    System.out.println("\nVocê utiliza autenticação em duas etapas?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");

    int p1 = leitor.nextInt();

    if (p1 == 1) {
        seguranca++;
    }

    // PERGUNTA 2
    System.out.println("\nVocê costuma trocar suas senhas?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");

    int p2 = leitor.nextInt();

    if (p2 == 1) {
        seguranca++;
    }

    // PERGUNTA 3
    System.out.println("\nVocê verifica se os sites possuem HTTPS?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");

    int p3 = leitor.nextInt();

    if (p3 == 1) {
        seguranca++;
    }

    // PERGUNTA 4
    System.out.println("\nVocê evita clicar em links desconhecidos?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");

    int p4 = leitor.nextInt();

    if (p4 == 1) {
        seguranca++;
    }

    // PERGUNTA 5
    System.out.println("\nVocê usa senhas diferentes em cada conta?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");

    int p5 = leitor.nextInt();

    if (p5 == 1) {
        seguranca++;
    }

    // RESULTADO FINAL
    System.out.println("\n===== RESULTADO FINAL =====");

    System.out.println("Você marcou " + seguranca + " de 5 práticas seguras.");

    if (seguranca == 5) {

        System.out.println("Excelente! Sua segurança digital está muito boa.");

    } else if (seguranca >= 3) {

        System.out.println("Bom nível de segurança, mas ainda pode melhorar.");

    } else {

        System.out.println("Atenção! Sua segurança digital está vulnerável.");
    }

    break;   
    
    case 5:

    System.out.println("Encerrando programa...");
    break;

    default:
    System.out.println("Opção inválida!");
    
            }

        }
        
    }
}