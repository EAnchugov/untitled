package org.example;

import java.util.Arrays;

public class QuickSort {
    public static void solution(int[] args){
        System.out.println(Arrays.toString(args));
        System.out.println("______________________");
        quickSort(args, 0, args.length - 1);
        System.out.println(Arrays.toString(args));
    }
    static int[] quickSort(int[] array, int left, int right){
        //Если массив пустой или в нем один элемент, сортировка остонавливается.
        if (array.length < 2){return array;}
        //Пока левая часть меньше правой.
        if (left< right) {
            int pi = partition(array,left,right);
            quickSort(array, left, pi - 1);
            quickSort(array, pi +1, right);
        }
        return array;
    }

    private static int partition(int[] array, int left, int right) {
//        Этот код реализует часть алгоритма быстрой сортировки - процедуру разделения (partition). Давайте разберем, как он работает:
//
//        1. Входные параметры метода `partition` - это массив `array`, индексы `left` и `right`, определяющие диапазон сортировки.
//        2. Мы выбираем опорный элемент (pivot) как элемент массива с индексом `right`.
//        3. Мы инициализируем индекс `i` так, что `i` указывает на последний элемент меньший опорного элемента (pivot), инициализируем его значением `(left - 1)`.
//        4. Мы проходим по элементам массива от `left` до `right - 1` включительно в цикле `for`.
//        5. Для каждого элемента `array[j]`, если он меньше, чем опорный элемент `pivot`, мы увеличиваем индекс `i` и меняем местами элементы `array[i]` и `array[j]`. Это означает, что все элементы, меньшие опорного элемента, перемещаются влево от `i`.
//        6. После завершения цикла `for`, все элементы меньше опорного элемента должны быть слева от `i`. Теперь мы меняем местами опорный элемент (`array[right]`) и элемент, стоящий справа от всех элементов, меньших опорного элемента, который находится на индексе `i + 1`.
//        7. Метод возвращает индекс `i + 1`, который теперь указывает на местоположение опорного элемента после разделения.
//
//        Этот метод разделения используется в алгоритме быстрой сортировки для разбиения массива на две части: одна содержит элементы меньше опорного, а другая - элементы больше или равные опорному.
        int pivot = array[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1;
    }
}
