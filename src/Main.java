import java.util.*;

public class Main {
    public static void main(String[] args) {
//        example2();
//        example3();
//        example4();
        task1();
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

    public static ArrayList<Integer> inputPositiveList(){
        //Создать список целых чисел
        ArrayList<Integer> nums = new ArrayList<>();
        //Попросить пользователя вводить только положительные числа.
        System.out.println("Вводите положительные числа");
        //Как только он введет отрицательное или 0, закончить ввод
        //
        Scanner scanner= new Scanner(System.in);
//        int x = scanner.nextInt();
//        while (x>0)
//        {
//            nums.add(x);
//            x = scanner.nextInt();
//        }
        for(int x = scanner.nextInt() ; x>0 ; x = scanner.nextInt())
            nums.add(x);
        return nums;
    }

    public static void task1(){
        ArrayList<Integer> nums = inputPositiveList();
        //Вывести список введенных чисел
        System.out.println(nums);
        //Вывести этот же список, отсортированный по возрастанию

        //Вычислить медианное значение для введенного списка
        double med = mediana(nums);
        System.out.println(med);
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
    }

    private static double mediana(ArrayList<Integer> nums) {
        nums.sort(Comparator.naturalOrder());
        int len = nums.size();
        if(len %2 == 1)
            return nums.get(len/2);
        else
        {
            int a = nums.get(len/2);
            int b = nums.get(len/2 - 1);
            return (a+b) / 2.0;
        }
    }
}