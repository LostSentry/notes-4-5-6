import java.util.ArrayList;
import java.util.LinkedList;
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

        //////////////////////////////////////////////////////////////
        List<String> trees = new LinkedList<>();

        trees.add("pine");
        trees.add("oak");
        trees.add("elm");
        trees.add("aspen");

        trees.add(2, "palm");
        System.out.println("Tree at index 1 is " + trees.get(1));
        for (String tree: trees) {
            System.out.println(tree);
        }

        trees.remove("oak");
        trees.remove(0);

        System.out.println(trees);

        if (trees.contains("aspen")) {
            System.out.println("Tree list contains aspen");
        }

        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");
    }
}
