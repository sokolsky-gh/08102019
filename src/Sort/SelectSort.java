package Sort;

public class SelectSort {
    public static void main(String [] args){
        int[] catWeight = {7000,6800,7100,5300,5900,7560,4699};/*Объявление переменной и определение массива
         */
        selectionSort(catWeight); /*вызов метода*/
    }

    public static void selectionSort(int[] arr){
        for (int catWeight = 0; catWeight < arr.length; catWeight++) /*цикл*/{
            int min = arr[catWeight];
            int min_i = catWeight;
            for (int j = catWeight+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (catWeight != min_i) {
                int tmp = arr[catWeight];
                arr[catWeight] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        for(int catWeight : arr) {
            System.out.println(catWeight);
        }
    }
}
