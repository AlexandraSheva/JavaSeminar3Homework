import java.util.ArrayList;
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
    task0(createList(10, 1, 11));
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
    /*java.util.Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext())   {
      Object o = iterator.next();
      if (o%2==0) {
        iterator.remove();
      }*/
      list.removeIf(n -> n%2 == 0);
      System.out.println(list);
  }
}