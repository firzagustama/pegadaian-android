package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
