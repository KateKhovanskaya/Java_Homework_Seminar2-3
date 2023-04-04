import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework3 {

public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(4);
    numbers.add(3);
    numbers.add(1);
    numbers.add(45);

    // Удалить четные элементы. Вариант 1
    //numbers.removeIf(num -> num%2 == 0);

    // Удалить четные элементы. Вариант 2
    removeEvenNumber(numbers);
    System.out.println(numbers);

    List<String> strings = new ArrayList<>();
    strings.add("string");
    strings.add("40");
    strings.add("-5");
    strings.add("my_string");
    removeIntegers(strings);
    System.out.println(strings); // [string, my_string]
}

static void removeEvenNumber(List<Integer> numbers) {
    
    // TODO: 31.03.2023 Удалить все четные элементы из списка
    Iterator<Integer> iterator = numbers.iterator();
    while(iterator.hasNext()){
        if(iterator.next()%2 == 0){
            iterator.remove();
        }
    }
}

static void removeIntegers(List<String> strings) {
    // TODO: 31.03.2023 Удалить строки, которые являются целыми числам
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            try {
                Integer.parseInt(iterator.next());
                iterator.remove();
                } catch (NumberFormatException e) {
              
                }
    }
}
}