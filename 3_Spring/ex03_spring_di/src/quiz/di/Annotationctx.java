package quiz.di;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotationctx {
	
	@Bean
	public Student student() {
		Student mystudent = new Student("김민수",21);
		mystudent.setMajor("컴퓨터공학");
		mystudent.setScore(4.3);
		return mystudent;
	}
	
	@Bean
	public Worker worker() {
		Worker myworker = new Worker("이수민",30);
		myworker.setDep("개발팀");
		myworker.setRank("대리");
		return myworker;
	}


}
