package com.lujieni.springbootconfig.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * springboot2.0后推荐实现WebMvcConfigurer接口
 * 配置跨域访问
 */
@Slf4j
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     *  配置json解析器为fastjson
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
            FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
            FastJsonConfig fastJsonConfig = new FastJsonConfig();
            fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

            List<MediaType> list = new ArrayList<>();
            list.add(MediaType.APPLICATION_JSON_UTF8);
            fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
            fastJsonHttpMessageConverter.setSupportedMediaTypes(list);

            converters.add(0, fastJsonHttpMessageConverter);
        }
     */

    /**
     * 设置允许跨域访问
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedOrigins("*")
                .allowedMethods("*");
    }
}
