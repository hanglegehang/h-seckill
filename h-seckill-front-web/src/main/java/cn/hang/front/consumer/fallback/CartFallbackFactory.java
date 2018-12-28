package cn.hang.front.consumer.fallback;

import cn.hang.front.consumer.CartClient;
import cn.hang.hseckill.common.constant.ResponseMessageEnum;
import cn.hang.hseckill.common.pojo.Response;
import cn.hang.hseckill.pojo.vo.CartVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lihang15
 */
@Slf4j
@Component
public class CartFallbackFactory implements FallbackFactory<CartClient> {
    @Override
    public CartClient create(Throwable cause) {
        return new CartClient() {
            @Override
            public Response addCart(List<CartVO> cartVOList, Long useId) {
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response<List<CartVO>> list(Long useId) {
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }

            @Override
            public Response delete(Long useId, Long[] itemId) {
                return Response.error(ResponseMessageEnum.NETWORK_ERROR);
            }
        };
    }
}

