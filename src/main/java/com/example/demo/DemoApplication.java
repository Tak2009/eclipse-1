package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		toStringをオーバーライドせず、Objectクラスに実装されているtoStringでEmployeeインスタンスの文字列表現をつかうとStringClassのObjectIDがreturnされる。
//		https://qiita.com/NagaokaKenichi/items/78015f53979b2545c2e6
		
//		Student susumu = new Student(1L, "Susumu", "s.kimoto@gmail.com", LocalDate.of(1950, Month.JANUARY, 31), 70);
//		System.out.println(susumu);
	}

}
