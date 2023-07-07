package com.example.algoritm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class AlgoritmApplication {
    *написание алгоритма вставки в список

    public static void main(String[] args) {
        SpringApplication.run(AlgoritmApplication.class, args) {
        LinkedList <String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        LinkedList <String> new_l_list = new LinkedList<String>();
        new_l_list.add("White");
        new_l_list.add("Pink");
        l_list.addAll(1, new_l_list);
        System.out.println("LinkedList: + l_list");
    }


    * процедура вставки элемента в голову списка
    class Main {
        public static void main(String[] args) {
            List<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Brown", "Purple"));
            String color = "Yellow";

            colors.add(0, color);
            System.out.println(colors);
        }


     * анализ алгоритма
     это функция,которая рекурсивно добавляет элементы в заданный массив А размера по порядку. Например, если мы используем вставку для добавления 1 в массив А = [2] или если используем ее для добавления 2 в массив А = [1]. В обоих случаях получаем А = [1.2}.

    }


    *задача по распределению сумм.
    class Main {
        public static void main(String[] args) {

            String[] producrs = new String[] {"Сахарный песок"};
            *извените не успел по времени
        }
    }


}
