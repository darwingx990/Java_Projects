public class Main {
    public static void main(String[] args) {
       double celcius = 40.6;

       double farhenheit = (celcius*1.8) + 32;

        System.out.println("%.1f grados Celsius equivalen a %.1f grados Farhenheit".formatted(celcius, farhenheit));

        int fahr= (int)((celcius*1.8)+32);
        System.out.println(String.format("%.2f grados celcius equivalen a %d grados Farhenheit",celcius, fahr));
    }
}