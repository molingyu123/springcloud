package com.ly.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义LoadBalance 接口
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
