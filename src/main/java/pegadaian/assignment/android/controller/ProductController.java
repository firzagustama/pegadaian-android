package pegadaian.assignment.android.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pegadaian.assignment.android.model.Product;
import pegadaian.assignment.android.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(path = "product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @CrossOrigin("*")
    @PostMapping
    public Product store(@RequestBody Product product) {
        return productService.store(product);
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @CrossOrigin("*")
    @GetMapping(path = "chart")
    public List<Product> getChart() {
        return productService.getChart();
    }
}
