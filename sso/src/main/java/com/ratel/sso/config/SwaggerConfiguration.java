package com.ratel.sso.config;

import com.ratel.sso.properties.ShiroPropertity;
import com.ratel.sso.properties.Swagger2Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Configuration
@EnableSwagger2
@EnableConfigurationProperties(Swagger2Property.class)
public class SwaggerConfiguration {
    @Autowired
    private Swagger2Property swagger2Property;

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/" + swagger2Property.getAddress())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swagger2Property.getBasePackage()))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("Ratel Swagger test")
                        .description("sso 单点登录服务 测试")
                        .version("1.0")
                        .contact(new Contact("ratel", "blog.ratel.com", "jxc19960306@outlook.com"))
                        .license("The Apache License")
                        .licenseUrl("http://blog.ratel.com")
                        .build());
    }
}
