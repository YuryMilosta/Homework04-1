import java.util.*;
public class HomeWork04 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Кофе", "картошка", "Опель",
                "Сыр", "Боб", "Хомяк",
                "Мир", "Собака", "Хомяк",
                "Вольво", "Кот", "Кофе",
                "Мир", "Боб", "Хомяк",
                "Собака", "Вольво", "Ява", "Мир"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Анатолий", "8765789235");
        directory.add("Анатолий", "8897645389");
        directory.add("Федор", "8897698324");
        directory.add("Федор", "8125698654");
        directory.add("Анатолий", "8907645342");
        directory.add("Кармелий", "8908765634");
        directory.add("Федор", "878965432");
        directory.add("Стуканов", "8888123113");
        directory.add("Кармелий", "834587654");

        System.out.println(directory.get("Анатолий"));
        System.out.println(directory.get("Федор"));
        System.out.println(directory.get("Кармелий"));
        System.out.println(directory.get("Стуканов"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}

