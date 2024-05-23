package Baku.center.com.mapper;

import Baku.center.com.dto.ShopDto;
import Baku.center.com.entity.Shop;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopMapper {
    ShopDto toShopDto(Shop shop);
    Shop toShop(ShopDto shopDto);
}
