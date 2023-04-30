public class Main2 {
    public static void main(String[] args) {

        int a = 3;

        int b = 4;


        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + c;
        double area = (a * b) / 2.0;



        System.out.println("Перимтп: " + perimeter);
        System.out.println("Плоша: " + area);
    }
}
