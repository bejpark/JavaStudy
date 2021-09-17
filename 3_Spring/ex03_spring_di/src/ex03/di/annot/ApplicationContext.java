package ex03.di.annot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
	
	@Bean
	public MyCats cat1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("꾹꾹이");
		hobbys.add("뒹굴기");
		
		MyCats mycats = new MyCats("쿠키",13,hobbys);
		mycats.setWeight(15.3);
		mycats.setColor("brown");
		
		return mycats;
		
	}
	
	@Bean
	public MyCats cat2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("aa");
		hobbys.add("bb");
		MyCats mycats = new MyCats("나옹",13,hobbys);
		mycats.setWeight(2.3);
		return mycats;

	}

}
