package cn.tzxcode.pay.dao;

import cn.tzxcode.pay.entity.PayConfigEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *配置信息数据操作
 *@auth tuzongxun
 *@email 1160569243@qq.com
 *@blog https://blog.tzxcode.cn、https://blog.csdn.net/tuzongxun
 */
@Component
@Slf4j
public class PayConfigDao {

    /**
     * 根据商户Id、支付机构类型和渠道查询支付配置信息
     * @param payType
     * @param channel
     * @return
     */
    public PayConfigEntity findPayConfig(String merChantId,String payType,String channel){
        //模拟数据库查询的结果
        PayConfigEntity payConfigEntity=new PayConfigEntity();
        System.out.println(payConfigEntity);
        return payConfigEntity;
    }
}