package com.ratel.sso.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ratel
 * @date 2020/3/1
 */
@Data
@ConfigurationProperties("shiro")
public class ShiroPropertity {
}
