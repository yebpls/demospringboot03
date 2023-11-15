package com.cybersoft.demospringboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Nếu muốn tạo ra class gán sẵn giá trị và sử dụng lại class này cho
* các Class khác thì phải đưa class này lưu trữ trên Container (IOC).
*
* @Bean, @Service, @Component, @Repository
*
* Cả 4 annotation đều có chức năng giống hệt nhau, nhưng tách biệt tên khác nhau
*  để đánh dấu ý nghĩa khác nhau của các Class, giúp ta dễ phân biệt.
*
* @Service: Class sử lí logic code
* @Component: Class đưa ra các hàm tái sử dụng
* @Repository: Class truy vấn cơ sở dữ liệu
*/

@SpringBootApplication
public class Demospringboot03Application {

	public static void main(String[] args) {
		SpringApplication.run(Demospringboot03Application.class, args);
	}

}
