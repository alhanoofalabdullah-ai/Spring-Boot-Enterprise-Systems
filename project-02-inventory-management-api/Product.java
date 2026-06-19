package com.alhanoof.inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String category;

    private Integer quantity;

    private Integer reorderLevel;

    private Double price;

    private String warehouseLocation;

    public Product() {
    }

    public Product(
            String productName,
            String category,
            Integer quantity,
            Integer reorderLevel,
            Double price,
            String warehouseLocation
    ) {
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.price = price;
        this.warehouseLocation = warehouseLocation;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public Double getPrice() {
        return price;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }
}
