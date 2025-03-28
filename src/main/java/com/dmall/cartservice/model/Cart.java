package com.dmall.cartservice.model;

import javax.persistence.*;


@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "option1", length = 255)
    private String option1;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'COMPLETED', 'CANCELED') DEFAULT 'ACTIVE'")
    private CartStatus status = CartStatus.ACTIVE;

    @Column(name = "product_id")
    private Long productId;

//    @Column(name = "Key", nullable = false, length = 255)
//    private String key;

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
        return option1;
    }

    public void setOption(String option) {
        this.option1 = option;
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

//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }

//     Enum for status
    public enum CartStatus {
        ACTIVE,
        COMPLETED,
        CANCELED
    }
}
