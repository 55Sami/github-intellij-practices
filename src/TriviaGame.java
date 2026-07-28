import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions ={"Who is Luffy's first crewmate?",
                              "Who is the father of Luffy?",
                             "Who is Luffy's brother?",
                             "Who is Luffy's mother?"};

        String[][] options ={{"1.Zoro","2.Sanji","3.Nami","4.Ussop"},
                           {"1.Bellamy","2.Dragon","3.Buggy","4.Law"},
                           {"1.Gabby","2.Blackbeard","3.Doflamingo","4.Ace"},
                           {"1.Dead","2.Nami","3.Not Revealed yet","4.Boa Hancock"}};
        int[] answers = {1,2,4,3};
        int score=0;
        int guess;

        System.out.println("*********************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("*********************************");

        for(int i = 0;i< questions.length; i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("You got "+score+" correct out of "+questions.length);
        scanner.close();
    }
}
