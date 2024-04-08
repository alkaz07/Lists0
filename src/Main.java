import java.util.*;

public class Main {
    public static void main(String[] args) {
        example2();
        example3();
        example4();
    }

    private static void example2() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Гриша", 19));
        Person[] mas3 = {new Person("Оксана", 31), new Person("Вася", 17), new Person("Петя", 94),
                new Person("Алина", 24), new Person("Юрий", 23)};
        people.addAll(List.of(mas3));

        System.out.println(people);

        people.sort(Comparator.comparing(Person::toString));
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getAge));
        System.out.println(people);

        for (Person p: people ) {
            System.out.println(p.getAge());
        }

        //people.sort(Comparator.naturalOrder());   //нельзя - у Person нет метода compareTo
    }

    private static void example4(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(68);

        int[] mas = {77, 44, 55, 33, 84, 86};
        for (int x: mas   ) {
            numbers.add(x);
        }
        System.out.println(numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }

    private static void example3(){
        List<Helicopter> helicopters = new LinkedList<>();
        helicopters.add(new Helicopter("Робинсон",3));
        helicopters.add(new Helicopter("Ми-17",23));
        helicopters.add(new Helicopter("Ка-52",13));
        helicopters.add(new Helicopter("Белл",10));

        //Можно - у Helicopter есть метод compareTo
        helicopters.sort(Comparator.naturalOrder());
        System.out.println(helicopters);

        helicopters.sort(Comparator.comparingInt(Helicopter::getCapacity));
        System.out.println(helicopters);

        helicopters.sort(Comparator.comparing(Helicopter::getName));
        System.out.println(helicopters);
    }

    private static void example1() {
        List<String> strings = new ArrayList<>();
        strings.add("Вася");
        strings.add("Леша");
        strings.addAll(List.of(new String[]{"Алена", "Женя"}));
        //вывод списка
        System.out.println(strings);
        //Добавление и удаление
        strings.add("Гриша");
        strings.remove("Леша");
        strings.remove(0);
        System.out.println(strings);
        //сортировка
        strings.sort(String::compareTo);
        System.out.println(strings);
    }
}