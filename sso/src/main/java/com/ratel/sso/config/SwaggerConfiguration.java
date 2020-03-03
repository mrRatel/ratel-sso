package com.ratel.sso.config;

import com.ratel.sso.properties.ShiroPropertity;
import com.ratel.sso.properties.Swagger2Property;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

/**
 * @author ratel
 * @date 2020/3/2
 */
@Configuration
@EnableSwagger2
@EnableConfigurationProperties(Swagger2Property.class)
@Slf4j
public class SwaggerConfiguration {
    @Autowired
    private Swagger2Property swagger2Property;
    private String swaggerUrl;

    @Bean
    public Docket createRestApi() {
        swaggerUrl = String.format("swagger api test url:%s/%s",swagger2Property.getAddress(),"swagger-ui.html");
        log.info(swaggerUrl);
        return new Docket(DocumentationType.SWAGGER_2)
//                .pathMapping("/"+ swagger2Property.getAddress())
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

    public void printSwaggerInfo(){
        log.info(swaggerUrl);
    }
}
