package cn.hang.front.consumer.fallback;

import cn.hang.front.consumer.ItemClient;
import cn.hang.hseckill.common.pojo.Response;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ItemFallbackFactory implements FallbackFactory<ItemClient> {
    @Override
    public ItemClient create(Throwable cause) {
        return new ItemClient() {
            @Override
            public Response getIndexInfo() {
                return null;
            }
        };
    }
}

