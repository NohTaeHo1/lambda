package user;

import java.util.List;
import java.util.Map;
import java.util.Optional;


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
}