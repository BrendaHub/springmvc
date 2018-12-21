package com.loiter.mvc.common.enums;

/**
 * @description: OrderStatusEnum
 * @author: ant-loiter
 * @date: 2018-12-21 15:31
 * 功能描述：一个枚举类， 用来定义订单的几个状态
 */
public enum OrderStatusEnum {
    WAIT_PAY(10, "待付款"),			// 代付款
    PAYING(20, "付款中"),			// 付款中
    PAID(30, "已付款"),				// 已付款
    PAID_FAILD(40, "付款失败"),		// 付款失败
    CANCELED(50, "已取消"),			// 已取消
    CLOSED(60, "交易关闭");			// 超时未支付, 交易关闭

    private final int key;
    private final String value;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    /**
     * @description:
     * @author: ant-loiter
     * @date: 2018-12-21 15:40
     * @param null:
     * @return:
     * 功能描述： 默认构造器， 初始化
     */
    OrderStatusEnum(int key, String value){
        this.key = key;
        this.value = value;
    }

    public static String getName(int key ) {
        for(OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if(orderStatusEnum.key == key) {
                return orderStatusEnum.value;
            }else {
                return null;
            }
        }
        return null;
    }

}
