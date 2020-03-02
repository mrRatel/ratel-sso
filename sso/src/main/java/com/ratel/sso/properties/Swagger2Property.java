package com.ratel.sso.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Data
@ConfigurationProperties(prefix = "swagger2")
public class Swagger2Property {
    /**
     * swagger uri
     */
    private String address;

    /**
     * swagger controller basePackage
     */
    private String basePackage;
}
