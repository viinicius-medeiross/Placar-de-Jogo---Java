import java.util.Scanner;

public class PlacarJogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Placar de Jogo ===");

        System.out.print("Digite o nome do Time 1: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o nome do Time 2: ");
        String time2 = scanner.nextLine();

        int pontosTime1 = 0;
        int pontosTime2 = 0;

        while (true) {
            System.out.println("\nPlacar Atual: " + time1 + " " + pontosTime1 + " x " + pontosTime2 + " " + time2);
            System.out.println("Quem pontuou? (1 - " + time1 + ", 2 - " + time2 + ", 0 - Encerrar): ");
            int ponto = scanner.nextInt();

            if (ponto == 1) {
                pontosTime1++;
            } else if (ponto == 2) {
                pontosTime2++;
            } else if (ponto == 0) {
                System.out.println("Jogo encerrado manualmente.");
                break;
            } else {
                System.out.println("Entrada inválida.");
                continue;
            }

            if (verificarVencedor(pontosTime1, pontosTime2)) {
                break;
            }
        }

        System.out.println("\nPlacar Final: " + time1 + " " + pontosTime1 + " x " + pontosTime2 + " " + time2);
        if (pontosTime1 > pontosTime2) {
            System.out.println("🏆 Vitória de " + time1 + "!");
        } 
        else if (pontosTime2 > pontosTime1){
            System.out.println("🏆 Vitória de " + time2 + "!");
        } 
        else {
            System.out.println("🏆 Jogo Empatado !");
        }

        scanner.close();
    }

    public static boolean verificarVencedor(int pontos1, int pontos2) {
        return (pontos1 >= 25 && pontos1 - pontos2 >= 2) || (pontos2 >= 25 && pontos2 - pontos1 >= 2);
    }
}
