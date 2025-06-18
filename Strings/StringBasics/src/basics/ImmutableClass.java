package basics;

public final class ImmutableClass {

	private int i;


	ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ImmutableClass i= new ImmutableClass(10);
       ImmutableClass i1= i.modify(100);
       ImmutableClass i2= i.modify(10);

		 System.out.println(i==i1);   
		 System.out.println(i==i2);   
		
	}

}
