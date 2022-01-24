package com.pumpkin.gulimall.member.feign;

import com.pumpkin.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pumpkin
 * @date 2022/1/24 0024 下午 17:46
 */
@FeignClient("gulimall-coupon")
@Component
public interface CoupoinFeignService {

    @GetMapping("/coupon/coupon/member/getCoupon")
    public R getAllCoupon() ;
}
