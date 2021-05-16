package by.beaverssgarage;

/**
 * Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова.
 * - через split - будет считать разделителем пробел
 * "кот кот кот собака" - кот: 3, собака: 1
 */
public class HomeWork3_4 {
    public static void main(String[] args) {
        String catsAndDogsSequence = "cat cat dog cat cat dog cat";
        String[]catsAndDogsSequenceSplitted = catsAndDogsSequence.split(" ");
        int catsAmount = 0;
        int dogsAmount = 0;
        for (int i = 0; i < catsAndDogsSequenceSplitted.length; i++) {
            if (catsAndDogsSequenceSplitted[i].equals("cat")){
                catsAmount++;
            }
            if (catsAndDogsSequenceSplitted[i].equals("dog")){
                dogsAmount++;
            }
        }
        System.out.println("We have a total of cats: " + catsAmount);
        System.out.println("We have a total of dogs: " + dogsAmount);
    }
}
