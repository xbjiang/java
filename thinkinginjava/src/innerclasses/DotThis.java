package innerclasses;

public class DotThis {
    void f() {System.out.println("DotThis.f()");}
    
    class Inner {
    	public DotThis outer() {
    		return DotThis.this;
    	}
    }
    
    public Inner inner() {return new Inner();}
    
    public static void main(String[] args) {
    	DotThis dt = new DotThis();
    	DotThis.Inner dti = dt.inner();
    	dti.outer().f();
    	//dt.inner().outer().f();
    }
}
