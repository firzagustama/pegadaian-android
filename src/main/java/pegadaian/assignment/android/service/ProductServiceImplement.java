package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import pegadaian.assignment.android.dao.ProductDao;
import pegadaian.assignment.android.model.Product;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService{
    private ProductDao productDao;

    @Autowired
    public ProductServiceImplement(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product store(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> getChart() {
        Product product = new Product();
        product.setInChart(1);

        return productDao.findAll(Example.of(product));
    }
}
