package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        // добавить 4 любых пользователя После каждого sout( User с именем – name добавлен в базу данных )
        userService.saveUser("Misha","Klyanskis",(byte)32);
        System.out.println("User с именем – Misha добавлен в базу данных");
        userService.saveUser("Mishanja","Klyanskis1",(byte)30);
        System.out.println("User с именем – Mishanja добавлен в базу данных");
        userService.saveUser("Mishka","Klyanskis2",(byte)29);
        System.out.println("User с именем – Mishka добавлен в базу данных");
        userService.saveUser("Michail","Klyanskis3",(byte)28);
        System.out.println("User с именем – Michail добавлен в базу данных");
        //Получение всех User из базы и вывод в консоль
        List<User> allUsers = userService.getAllUsers();
        for(User user:allUsers){
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();




    }
}
