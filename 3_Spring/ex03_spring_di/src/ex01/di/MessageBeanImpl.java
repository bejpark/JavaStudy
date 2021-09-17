package ex01.di;

public class MessageBeanImpl implements MessageBean {

	private String name,greeting;
	public MessageBeanImpl(){}	
	public MessageBeanImpl(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}



	public void setName(String name) {
		this.name = name;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting + " / "+name+".");
	}

}
