package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        User user1 = new User("John", "Doe", (byte) 25);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.printf("User с именем – %s добавлен в базу данных\n", user1.getName());

        User user2 = new User("Jane", "Smith", (byte) 30);
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.printf("User с именем – %s добавлен в базу данных\n", user2.getName());

        User user3 = new User("Alice", "Johnson", (byte) 28);
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.printf("User с именем – %s добавлен в базу данных\n", user3.getName());

        User user4 = new User("Bob", "Williams", (byte) 35);
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.printf("User с именем – %s добавлен в базу данных\n", user4.getName());

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
