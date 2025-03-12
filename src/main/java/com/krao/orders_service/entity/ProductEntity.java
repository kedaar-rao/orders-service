package com.krao.orders_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private @Getter Long id;

    private @Getter @Setter String name;

    private  @Getter @Setter Double price;

    private  @Getter @Setter Integer inventoryQuantity;
}
