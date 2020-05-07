package Pack1;

import java.util.Random;

public class TestBubbleSort {

    public static void main(String[] args) {

        int[] testTab = new int[30];
        Random random = new Random();
        for (int i = 0; i < testTab.length; i++) {
            testTab[i] = random.nextInt(100);
        }

        testSort(testTab);
        double time = System.currentTimeMillis();
        AlgorithmBubbleSort.sort(testTab);
        double howLong = System.currentTimeMillis() - time;
        System.out.printf("Czas sortowania wynosi = %f" , howLong);
        System.out.println();
        testSort(testTab);

    }

    private static void testSort(int[] tab)
    {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }


}
