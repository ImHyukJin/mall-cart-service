package com.dmall.cartservice.model;

import javax.persistence.*;


@Entity
@Table(name = "mall_cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "option", length = 255)
    private String option;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'COMPLETED', 'CANCELED') DEFAULT 'ACTIVE'")
    private CartStatus status = CartStatus.ACTIVE;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "Key", nullable = false, length = 255)
    private String key;

    // Getters and Setters

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public CartStatus getStatus() {
        return status;
    }

    public void setStatus(CartStatus status) {
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    // Enum for status
    public enum CartStatus {
        ACTIVE,
        COMPLETED,
        CANCELED
    }
}
