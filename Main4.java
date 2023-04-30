import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 3;
        int randomNumber1 = (int) (Math.random() * (max - min + 1) + min);
        int randomNumber2 = (int) (Math.random() * (max - min + 1) + min);
        int randomNumber3 = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("Ви участвуєте в лотареї !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вгадайте три числа (розділені пробілами):");
        String guess = scanner.nextLine();
        String[] guessArray = guess.split(" ");

        if (guessArray.length != 3) {
            System.out.println("Недійсне припущення. Потрібно ввести три цифри.");
        } else {
            int guess1 = Integer.parseInt(guessArray[0]);
            int guess2 = Integer.parseInt(guessArray[1]);
            int guess3 = Integer.parseInt(guessArray[2]);

            if (guess1 == randomNumber1 && guess2 == randomNumber2 && guess3 == randomNumber3) {
                System.out.println("вітаю! Ви виграли в лотерею!");
            } else {
                System.out.println("вибачте, ви не виграли в лотерею. Правильні цифри були "
                        + randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3 + ".");
                System.out.println("У вас є ще один шанс. Відгадайте три числа:");
                guess = scanner.nextLine();
                guessArray = guess.split(" ");
                if (guessArray.length != 3) {
                    System.out.println("Недійсне припущення. Потрібно ввести три цифри.");
                } else {
                    guess1 = Integer.parseInt(guessArray[0]);
                    guess2 = Integer.parseInt(guessArray[1]);
                    guess3 = Integer.parseInt(guessArray[2]);
                    if (guess1 == randomNumber1 && guess2 == randomNumber2 && guess3 == randomNumber3) {
                        System.out.println("вітаю! Ви виграли в лотерею!");
                    } else {
                        System.out.println("Вибачте, ви не виграли в лотерею. Правильні цифри були "
                                + randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3 + ".");
                    }
                }
            }
        }

    }
}