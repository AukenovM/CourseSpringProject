package kz.iitu.itse1901.mukhamedrassul.Repository;

import kz.iitu.itse1901.mukhamedrassul.Database.Users;

import java.util.List;
import java.util.Optional;

public interface UserRepo {
    int count();

    int save(Users users);

    int update(Users users);

    int deleteById(Long id);

    List<Users> findAll();

    List<Users> findByNameAndCity(String name, String city);

    Optional<Users> findById(Long id);

    String getNameById(Long id);
}
