package com.techpoa.spring_boot_temporal_sample.entity;

import com.techpoa.spring_boot_temporal_sample.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order_item")
public class OrderItem {
    @Id
    private String id;

    private String name;

    private String price;

    private String quantity;

    private String order_id;
}
