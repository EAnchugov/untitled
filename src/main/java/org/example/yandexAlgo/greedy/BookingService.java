package org.example.yandexAlgo.greedy;

import java.util.*;

public class BookingService {
    //https://new.contest.yandex.ru/48557/problem?id=215/2023_04_06/RdGbbmsLQn
//    Задано n интервалов. Требуется найти максимальное количество взаимно непересекающихся интервалов.
//    Два интервала пересекаются, если они имеют хотя бы одну общую точку.
//    Формат ввода
//    В первой строке задано одно число n(1≤n≤100) — количество интервалов.
//    В следующих n строках заданы интервалы
//    Формат вывода.
//    Выведите ответ на задачу.

    static ArrayList<Booking> bookings;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество букингов

        //Инициализация и заполнение
        bookings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            int e = scanner.nextInt();
            bookings.add(new Booking(b,e));
        }


        //Решение
        bookings.sort(Comparator.comparingInt(booking -> booking.end));
        int answer = 1;
        int end = bookings.get(0).end;

        for (Booking booking: bookings) {
            if (booking.begin > end ) {
                end = booking.end;
                answer++;
            }
        }
        System.out.println(answer);
    }

    static class Booking{
        int begin;
        int end;
        public Booking(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Booking{" +
                    "begin=" + begin +
                    ", end=" + end +
                    '}';
        }
    }
}