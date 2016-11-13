package innerclasses;

public class DotNew {
    class Inner {}
    public static void main(String[] args)
    {
    	DotNew dn = new DotNew();
    	DotNew.Inner dti = dn.new Inner();
    }
}
