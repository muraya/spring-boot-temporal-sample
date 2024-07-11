package com.techpoa.spring_boot_temporal_sample.utils;

import com.techpoa.spring_boot_temporal_sample.dto.OrderDto;
import com.techpoa.spring_boot_temporal_sample.entity.Order;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static OrderDto entityToDto(Order order) {
        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(order, orderDto);
        return orderDto;
    }

    public static Order dtoToEntity(OrderDto productDto) {
        Order order = new Order();
        BeanUtils.copyProperties(productDto, order);
        return order;
    }

}
