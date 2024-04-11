package org.example.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DepthSearch {
    static List<List<Integer>> graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество вершин
        int m = scanner.nextInt(); // Количество ребер

        // Инициализация графа
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        //заполняем граф
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt(); // Вершина ребра 1
            int v = scanner.nextInt(); // Вершина ребра 2
            graph.get(u).add(v);
            //Если граф не оринтированный, то добавляем обратное ребро.
            graph.get(v).add(u);
        }

        //Посещенные вершины
        visited = new boolean[n+1];

        //Компоненты связанности
        List<Integer> connected = new ArrayList<>();
        //Поиск связанных компонент
        dfs(1,connected);

        //вывод
        //Формат вывода
        //В первую строку выходного файла выведите число K — количество вершин в компоненте связности.
        // Во вторую строку выведите        //K целых чисел — вершины компоненты связности, перечисленные в порядке возрастания номеров.
        System.out.println(connected.size());
        // TODO: 11.04.2024 Зачем сортировка?
        Collections.sort(connected);
        for (Integer v:connected) {
            System.out.print(v + " ");
        }
    }

    //Алгоритм поиска компонентов
    private static void dfs(int v, List<Integer> connected) {
        //Первая вершина посещенна
        visited[v] = true;
        connected.add(v);
        //для всего графа
        for (int u: graph.get(v)) {
            //если вершина не просмотренна
            if (!visited[u]){
                //обходим ея
                dfs(u,connected);
            }
        }
    }
}
