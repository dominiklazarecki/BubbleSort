package Pack1;

public class AlgorithmBubbleSort {

    public static void sort(int[] tab)
    {
        int n = tab.length;
        int iterator = 0;
        boolean swapped = true;

        while (iterator < n -1 && swapped) {
            swapped = false;
            for (int i = 0; i < n - 1 - iterator; i++) {
                if (tab[i] > tab[(i + 1)])
                {
                    swap(tab, i, (i + 1));
                    swapped = true;
                }
            }
            iterator++;
        }
    }

    private static void swap(int[] array, int value1, int value2 )
    {
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }
}
