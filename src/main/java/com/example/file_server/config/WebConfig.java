package com.example.file_server.config;

import com.example.file_server.interceptor.AuthenticateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The mapping matches URLs using the following rules:
 * ? matches one character
 * matches zero or more characters
 * * matches zero or more directories in a path
 * {spring:[a-z]+} matches the regexp [a-z]+ as a path variable named "spring"
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private FileUploadConfiguration fileUploadConfiguration;
    @Autowired
    private AuthenticateInterceptor authenticateInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(fileUploadConfiguration.getFile_upload_path())
                .addResourceLocations("file:" + fileUploadConfiguration.getFile_upload_location());
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authenticateInterceptor).addPathPatterns("/file/**")
//                .excludePathPatterns(fileUploadConfiguration.getFile_upload_path());
//    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("http://*:[*]")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("*")
                .allowCredentials(true).maxAge(3600);
    }
}
