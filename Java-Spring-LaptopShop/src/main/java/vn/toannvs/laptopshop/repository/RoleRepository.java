package vn.toannvs.laptopshop.repository;

import org.springframework.stereotype.Repository;
import vn.toannvs.laptopshop.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Define any custom query methods if needed
    Role findByName(String name);

    
}{

}
