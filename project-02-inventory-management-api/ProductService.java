package com.alhanoof.inventory.service;

import com.alhanoof.inventory.entity.Product;
import com.alhanoof.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product request) {
        Product product = getProductById(id);

        product.setProductName(request.getProductName());
        product.setCategory(request.getCategory());
        product.setQuantity(request.getQuantity());
        product.setReorderLevel(request.getReorderLevel());
        product.setPrice(request.getPrice());
        product.setWarehouseLocation(request.getWarehouseLocation());

        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    public List<Product> getLowStockProducts() {
        return repository.findAll()
                .stream()
                .filter(product -> product.getQuantity() <= product.getReorderLevel())
                .toList();
    }
}
