//package com.example.core.beenFind;
//
//import com.example.core.AppConfig;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class ApplicationContextInfoTest {
//
//    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//
//    @Test
//    void findAllBean() {
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            Object bean = ac.getBean(beanDefinitionName);
//            System.out.println("name = " + beanDefinitionName + "object  = " + bean);
//        }
//    }
//
//    @Test
//    void findApplicationBean2() {
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
//
//            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
//                Object bean = ac.getBean(beanDefinitionName);
//                System.out.println("name = " + beanDefinitionName + "object  = " + bean);
//            }
//        }
//    }
//
//}
