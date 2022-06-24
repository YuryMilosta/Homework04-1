import java.util.*;
public class HomeWork04 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "����", "��������", "�����",
                "���", "���", "�����",
                "���", "������", "�����",
                "������", "���", "����",
                "���", "���", "�����",
                "������", "������", "���", "���"
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

        directory.add("��������", "8765789235");
        directory.add("��������", "8897645389");
        directory.add("�����", "8897698324");
        directory.add("�����", "8125698654");
        directory.add("��������", "8907645342");
        directory.add("��������", "8908765634");
        directory.add("�����", "878965432");
        directory.add("��������", "8888123113");
        directory.add("��������", "834587654");

        System.out.println(directory.get("��������"));
        System.out.println(directory.get("�����"));
        System.out.println(directory.get("��������"));
        System.out.println(directory.get("��������"));
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

