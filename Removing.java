
import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web client server");
        classNames.add("Project management");
        classNames.add("Info tech concept");

        for (String name: classNames) {
            System.out.println(name);
        }
        System.out.println();

        for (int i = 0 ; i < classNames.size() ; i++) {
            System.out.println(classNames.get(i));
        }
        while (!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
        }
        System.out.println();

        classNames.remove("Project management");
        System.out.println(classNames);

        classNames.set(0, "Project Management");
        classNames.remove(0);  //int primitive
        System.out.println(classNames);

        if (classNames.contains("C# programming")) {
            System.out.println("The List contains c#");
        } else {
            System.out.println("The list does not contain c#");
        }
        classNames.clear();
        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());
    }
}
