package com.techpoa.spring_boot_temporal_sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {

    @Id
    private String id;

    private String name;

    private String orderAmount;
}
