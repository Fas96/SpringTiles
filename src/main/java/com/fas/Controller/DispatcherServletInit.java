package com.fas.Controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            //here we can configure database
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{ConfigBase.class};
        }

        @Override
        protected String[] getServletMappings() {

            return new String[]{"/"};
        }

}
