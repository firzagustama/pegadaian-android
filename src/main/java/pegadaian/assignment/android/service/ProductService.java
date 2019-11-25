package pegadaian.assignment.android.service;

import org.springframework.stereotype.Service;
import pegadaian.assignment.android.model.Product;

import java.util.List;

@Service
public interface ProductService {
    Product store(Product product);

    List<Product> getAll();

    List<Product> getChart();
}
