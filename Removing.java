
import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web client server");
        classNames.add("Project management");
        classNames.add("Info tech concept");

        System.out.println(classNames);

        classNames.remove("Project management");
        System.out.println(classNames);

        classNames.remove(0);  //int primitive
        System.out.println(classNames);
    }
}
