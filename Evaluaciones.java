import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalEvaluaciones = 0;
        double nota = 0;
        double mediaEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota;
                ++totalEvaluaciones;
            }
        }
        System.out.println("La media de evaluaciones es de: " + (mediaEvaluaciones / totalEvaluaciones));
    }
}
