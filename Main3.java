public class Main3 {
    public static void main(String[] args) {

        int min = 0;
        int max = 101;

        int randomNumber = (int) (Math.random() * (max - min) + min);

        int digits = String.valueOf(randomNumber).length();

        System.out.println(randomNumber);
        System.out.println("Кількість цифр: " + digits);

    }
}
