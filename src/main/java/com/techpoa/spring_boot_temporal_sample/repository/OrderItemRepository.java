package com.techpoa.spring_boot_temporal_sample.repository;

import com.techpoa.spring_boot_temporal_sample.dto.OrderDto;
import com.techpoa.spring_boot_temporal_sample.entity.Order;
import com.techpoa.spring_boot_temporal_sample.entity.OrderItem;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface OrderItemRepository extends ReactiveMongoRepository<OrderItem, String> {

    Flux<OrderDto> findByPriceBetween(Range<Double> priceRange);

}
