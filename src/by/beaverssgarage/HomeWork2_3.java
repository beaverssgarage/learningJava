package by.beaverssgarage;
import java.util.Scanner;

/**
 * Задать пользователю любой вопрос
 * и дать ограниченное количество попыток для верного ответа.
 * Предусмотреть возможность сдаться.
 */
public class HomeWork2_3 {
    private static final String imGiveUp = "looser";
    private static final String YES_YOU_DID_IT = "Yes, you did it!";
    private static final String LOOOOOSER_I_KNEW_YOU_COULDN_T_HANDLE = "Loooooser! I knew you couldn't handle!";

    public static void main(String[] args) {
        String answer = "Because beavers are gods of rocketjump";
        System.out.println("Hello. I'm going to ask you one simple question. " +
                "You have three attempts to enter the correct answer. Or give up :)" +
                " So. Why beavers can fly?");
        Scanner scanner = new Scanner(System.in);
        String answerInput = scanner.nextLine();                                    // The first attempt
    if (answerInput.equals(answer)){
            System.out.println(YES_YOU_DID_IT);
        }
        else {
            System.out.println("Sorry, you didnt guess. Maybe you want give up?" +
                    " Enter \"" + imGiveUp + "\" and be done with it. Or try again");
        String answerInputAttemptTwo = scanner.nextLine();                          // The second attempt
    if (answerInputAttemptTwo.equals(answer)){
            System.out.println(YES_YOU_DID_IT);
        }
        else if (answerInputAttemptTwo.equals(imGiveUp)){
            System.out.println(LOOOOOSER_I_KNEW_YOU_COULDN_T_HANDLE);
        }
        else{
            System.out.println("Try again? Or do you give up?");
        }
        }
        String answerInputAttemptThree = scanner.nextLine();                        //The third attempt
    if (answerInputAttemptThree.equals(answer)){
            System.out.println(YES_YOU_DID_IT);
        }
        else if (answerInputAttemptThree.equals(imGiveUp)){
            System.out.println(LOOOOOSER_I_KNEW_YOU_COULDN_T_HANDLE);
        }
        else{
            System.out.println("Sorry, but you couldn't guess. But you tried, I saw it!");
    }
    }
}
