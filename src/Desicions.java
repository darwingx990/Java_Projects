public class Desicions {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2022;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 6.2;

        if (fechaDeLanzamiento < 2022 && notaDeLaPelicula>7) {
            System.out.println("Movie is not recent but it is a good option.");
        } else if (fechaDeLanzamiento>2021 && notaDeLaPelicula>7) {
            System.out.println("This is a good and a new movie");

        } else {
            System.out.println("This movie is a Regular movie.");
        }
    }
}
