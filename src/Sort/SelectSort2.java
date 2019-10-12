package Sort;

import java.util.Arrays;

public class SelectSort2 {

    public static void main(String[] args) {
        int[] unsortedArray = {19,3,4,6,7,8,2,1,5,6};
        System.out.println(Arrays.toString(unsortedArray));
        choiseSort(unsortedArray);
    }


    public static void choiseSort(int[] arrayToSort) {

        //Проходим по массиву
        //ищем ин элемент
        //Меняем местами 1ый и минимальный элемент

        //повторяем, пока не пройдём весь массив
        int indexMin;
        for (int index = 0; index < arrayToSort.length-1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]){
                    indexMin = indexToScan;
                }
            }

            int temp = arrayToSort[index];
            arrayToSort[index]= arrayToSort[indexMin];
            arrayToSort[indexMin]=temp;
        }

        System.out.printf(Arrays.toString(arrayToSort));
    }


}
