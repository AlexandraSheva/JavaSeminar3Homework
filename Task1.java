import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;


/**
 * Task1. Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */
public class Task1 {

  public static void main(String[] args) {
    //task0(createList(10, 1, 11));            //первые два метода закомментила, чтобы они не мешали при выполнении последующих
    //task1(createList(10, 1, 11));
    task2(createList(10, 1, 11));
  }

  static List<Integer> createList(int size, int min, int max) {
    List <Integer> list = new ArrayList<> (size);
    for (int i = 0; i < size; i++) {
      list.add((int)(Math.random()*(max-min+1) + min));
    }
    System.out.println(list);
    return list;

  }

  static void task0(List <Integer> list) {
    /*java.util.Iterator<Integer> iterator = list.iterator(); // тут попыталась сделать черех итератор, но высвечивается, что нельза object 
    while (iterator.hasNext())   {             // перевести в Integer. Как правильно работать с типами при итераторе, чтобы не высвечивались такие ошибки?
      Object o = iterator.next();
      if (o%2==0) {
        iterator.remove();
      }*/
      list.removeIf(n -> n%2 == 0);
      System.out.println(list);
  }

  static void task1 (List <Integer> list) {
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
  }

  static void task2 (List <Integer> list) {
    //int av = Stats.meanOf (list)
    double sum = 0;
    for (int i: list) {
            sum += i;
    }
    double avg = sum/list.size();
    System.out.println(avg);
  }
}