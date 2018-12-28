package cn.hang.front.consumer.fallback;

import cn.hang.front.consumer.ItemClient;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.po.ItemPO;
import cn.hang.hseckill.pojo.vo.ItemVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author lihang15
 */
@Slf4j
@Component
public class ItemFallbackFactory implements FallbackFactory<ItemClient> {
    @Override
    public ItemClient create(Throwable cause) {
        return new ItemClient() {
            @Override
            public Response getIndexInfo() {
                log.error("ItemClient.getIndexInfo failBack");
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response<ItemVO> getItemById(Long id) {
                log.error("ItemClient.getItemById failBack id={}", id);
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }
        };
    }
}

