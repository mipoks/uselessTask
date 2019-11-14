import javafx.util.Pair;

import java.util.Scanner;


public class MyCll {
    public static void insertSort(float[] mas, int n) {
        int k = 0, key = 0;
        float temp;
        for (int i = 0; i < n - 2; i += 2)
        {
            key = i + 2;
            temp = mas[key];
            for (int j = i + 2; j > 0; j -= 2)
            {
                if (temp < mas[j - 2])
                {
                    mas[j] = mas[j - 2];
                    key = j - 2;
                }
            }
            mas[key] = temp;
        }
    }
    public static void selectionSort(float[] mas, int n) {
        for (int i = 1; i < n - 2; i += 2)
        {
            int smallestIndex = i;
            for (int j = i + 2; j < n; j += 2)
            {
                if (mas[j] < mas[smallestIndex])
                    smallestIndex = j;
            }
            float tmp = mas[i];
            mas[i] = mas[smallestIndex];
            mas[smallestIndex] = tmp;
        }
    }
    public static void main(String[] args) {
        float[] mas = new float[]{11.25f, 9.75f, 5.75f, 6.25f, 13.75f, 6.25f, 12.75f, 13.75f, 12.25f, 8.25f, 13.25f,
                13.75f, 12f, 10.75f, 11.25f, 2.25f, 7.25f, 12.75f, 8.25f, 12.75f, 5.25f, 12.25f, 12.75f, 13.25f, 5.75f};
        int n = mas.length;
        selectionSort(mas, n);
        insertSort(mas, n);
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}

