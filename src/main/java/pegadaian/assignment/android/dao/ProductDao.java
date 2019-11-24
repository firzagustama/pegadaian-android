package pegadaian.assignment.android.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pegadaian.assignment.android.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
