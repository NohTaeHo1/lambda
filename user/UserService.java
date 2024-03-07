package user;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;


public interface UserService {
    String addUsers();
    String join(User user);
    String login(User user);
    String updatePassword(User user);
    String deleteUser(String username);
    List<?> getUserList();
    List<?> findUsersByName(String name);
    Map<String, ?> findUsersByNameFromMap(String name);
    List<?> findUsersByJob(User job);
    Map<String, ?> findUsersByJobFromMap(String job);
    String countUsers();

    Map<String, ?> getUserMap();

    String test();

    String findUser(Scanner sc);

    List<?> findUsers() throws SQLException;
}