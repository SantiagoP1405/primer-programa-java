import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int cantidadCalificaciones = 3;
        for (int i = 0; i < cantidadCalificaciones; ++i) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }
        System.out.println("La media de evaluaciones es de: " + (mediaEvaluaciones / cantidadCalificaciones));
    }
}
