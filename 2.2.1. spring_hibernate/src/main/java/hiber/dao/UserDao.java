package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserDao {
   void add(User user);
   TypedQuery<User> selectUserByModelAndSeries(String model, int series);
   List<User> listUsers();
}
