import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> todoList = new ArrayList<>();
    
    while (true) {
        String data = stringInput("Please type a task you need to do, or press enter to quit.");
        if (data.length() == 0) {
            break;
        }
        todoList.add(data);
    }
}
