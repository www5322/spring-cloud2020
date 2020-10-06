/**
 * LoadBalancer.java 2020年9月12日
 */
package com.atguigu.cloud.lb;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * <p>
 * <b>LoadBalancer</b> is
 * </p>
 *
 * @since 2020年9月12日
 * @author zengwk
 * @version $Id$
 */
public interface LoadBalancer {

	ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
