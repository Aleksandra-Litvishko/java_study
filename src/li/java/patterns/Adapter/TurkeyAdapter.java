package li.java.patterns.Adapter;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {                      //устанавливаем соответствие между дальностью полёта утки и индюшки
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
