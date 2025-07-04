package vn.toannvs.laptopshop.repository;

import org.springframework.stereotype.Repository;
import vn.toannvs.laptopshop.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hoidanit);

    List<User> findAll();

    List<User> findAllByEmail(String email);

}
