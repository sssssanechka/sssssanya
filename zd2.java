package lab2;

public class zd5 {
    public static void main(String[] args) {
        double a = 3; // длина известного катета
        double c = 5; // длина гипотенузы

        // Вычисление длины второго катета
        double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));

        // Вывод результата
        System.out.println("Длина второго катета (b) равна: " + b);
    }
}
