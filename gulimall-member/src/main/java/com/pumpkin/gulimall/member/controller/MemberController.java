package com.pumpkin.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.pumpkin.gulimall.member.feign.CoupoinFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.pumpkin.gulimall.member.entity.MemberEntity;
import com.pumpkin.gulimall.member.service.MemberService;
import com.pumpkin.common.utils.PageUtils;
import com.pumpkin.common.utils.R;



/**
 * 会员
 *
 * @author pumpkin
 * @email 602437361@qq.com
 * @date 2022-01-24 00:39:03
 */
@RestController
@RequestMapping("member/member")
@RefreshScope //动态刷新
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CoupoinFeignService coupoinFeignService ;

    @Value("${config.name}")
    private String name ;

    @Value("${config.girlfriend}")
    private String girlfriend ;

    @GetMapping("/getConfig")
    public R getConfig(){
        return R.ok().put("name" , name).put("girlfriend" , girlfriend) ;
    }

    @GetMapping("/getCoupon")
    public R getCoupon(){
        MemberEntity entity = new MemberEntity();
        entity.setNickname("张三");
        R coupon = coupoinFeignService.getAllCoupon();
        return coupon.put("member" ,entity) ;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
