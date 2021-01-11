package com.fedorov.spring.springboot.spring_course_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@SpringBootApplication заменяет аннотации @Configuration, @EnableAutoConfiguration
и @ComponentScan. Сканируется пакет - spring_course_springboot и его подпакеты.
Поэтому важно данный класс не перемещать в какой-либо пакет, а оставить его
где он был создан, иначе процесс сканирования может быть некоректен.
С помощью указания в @SpringBootApplication(scanBasePackages="") можем укаазать
 какие пакеты нужно отсакнировать
 */
@SpringBootApplication
public class SpringCourseSpringbootApplication {
    /*
    Когда запускается данное спринг приложение, автоматически создается
    спринг контейнер, происходит автоматическое сканирование и поиск бинов и
    регистрации их в спринг контейнер. Затем поднимается томкэт сервер и на нем
    запускается наше приложение.
     */

    public static void main(String[] args) {
        // все вышеописанные действия заменяются этой строчкой кода.
        SpringApplication.run(SpringCourseSpringbootApplication.class, args);
    }

}
