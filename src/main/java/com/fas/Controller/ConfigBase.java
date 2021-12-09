package com.fas.Controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.fas.Controller"})
public class ConfigBase implements WebMvcConfigurer {


        @Bean
        public InternalResourceViewResolver viewResolver() {
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setViewClass(JstlView.class);
            viewResolver.setPrefix("/WEB-INF/views/");
            viewResolver.setSuffix(".jsp");
            viewResolver.setOrder(1);
            return viewResolver;
        }
/*
        @Bean
        public TilesConfigurer tilesConfigurer(){
            TilesConfigurer tilesConfigurer = new TilesConfigurer();
            tilesConfigurer.setDefinitions("/WEB-INF/tiles.xml");
            tilesConfigurer.setCheckRefresh(true);
            return tilesConfigurer;
        }

        @Override
        public void configureViewResolvers(ViewResolverRegistry registry) {
            TilesViewResolver viewResolver = new TilesViewResolver();
            viewResolver.setViewClass(TilesView.class);
            viewResolver.setOrder(0);
            registry.viewResolver(viewResolver);
        }*/

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/**").addResourceLocations("/resources/static/");
        }


}
