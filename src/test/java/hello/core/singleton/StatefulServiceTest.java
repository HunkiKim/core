package hello.core.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest
{
    @Test
    void statuefulServiceSingleton()
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA : A사용자가 10000원을 주문
        int price1 = statefulService1.order("userA",10000);
        //ThreadB : B사용자가 20000원을 주문
        int price2 = statefulService2.order("userB",20000);

        //ThreadA : 사용자 A 주문 금액 조회
        assertThat(price1).isEqualTo(20000);

    }
    @Configuration
    static class TestConfig
    {
        @Bean
        public StatefulService statefulService()
        {
            return new StatefulService();
        }
    }
}