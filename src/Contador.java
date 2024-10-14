import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:  ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:  ");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o metodo contendo a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem da exceção
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o cálculo da contagem
        int contagem = parametroDois - parametroUm;

        // Executar o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
