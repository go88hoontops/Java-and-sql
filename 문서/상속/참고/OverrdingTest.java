class OverridingParent{
	void parentMethod(){
		System.out.println("parent method");
	}
}
class OverridingChild extends OverridingParent{
	void parentMethod(){
		System.out.println("overridng method");
	}
}
public class OverrdingTest {
	/**
	 * Overridng 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}
