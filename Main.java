package Lists;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ListTestImmutable();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        System.out.println(list.get(2));
        list.clear();
        System.out.println(list.size());

    }
}
