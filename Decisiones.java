public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPLan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }
        else{
            System.out.println("Peículas retro que aun vale la pena ver");
        }

        if (incluidoEnElPLan && tipoPlan == "plus"){
            System.out.println("Dsfruta tu película");
        }
        else{
            System.out.println("Peícula no disponible en su plan actual");
        }
    }
}
