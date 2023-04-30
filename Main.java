public class Main {
    public static void main(String[] args) {
        int min = -20;
        int max = 20;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(randomNumber);
    }
}