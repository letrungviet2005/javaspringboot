package vn.toannvs.laptopshop.repository;

import org.springframework.stereotype.Repository;
import vn.toannvs.laptopshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Define any custom query methods if needed
    Optional<Product> findById(Long id);

    List<Product> findAll();

}
