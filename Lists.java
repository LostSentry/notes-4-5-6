import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println(arrayList);
        arrayList.add("Reyna");
        arrayList.add("MCTC");
        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

    }
}
