package Baku.center.com.mapper;

import Baku.center.com.dto.OrderDto;
import Baku.center.com.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toOrderDto(Order order);
    Order toOrder(OrderDto orderDto);
}
