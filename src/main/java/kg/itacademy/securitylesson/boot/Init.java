package kg.itacademy.securitylesson.boot;

import kg.itacademy.securitylesson.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** То что будет выполнено после запуска приложения
 *  В данном примере будут добавлены Task'и в базу данных **/

@Component
public class Init implements CommandLineRunner {

    @Autowired
    private TaskService taskService;

    @Override
    public void run(String... args) throws Exception {
//        taskService.create(new Task("First Task", "Create app", true));
//        taskService.create(new Task("Second Task", "Add Entity", false));
//        taskService.create(new Task("Important Task", "Call boss", false));
//        taskService.create(new Task("Test task", "qwerty", true));
//        taskService.create(new Task("Last Task", "Something", false));
    }
}
