package com.techpoa.spring_boot_temporal_sample.dto;

public record OrderItemDto(String id, String name, String price, String quantity, OrderDto order) {}
