package innerclasses;

public class Parcel9 {
	// thinking in java 4th 里说参数必须是final
	// 实际上JDK 1.8 不用加final，但是参数不能改变
    public Destination destination(final String dest)
    {
    	// dest = "shit"; 这样是不行的
    	return new Destination() {
    		private String label = dest;
    		public String readLabel() {return label;}
    	};
    }
    
    public static void main(String[] args)
    {
    	Parcel9 p = new Parcel9();
    	Destination d = p.destination("Tasmania");
    	System.out.println(d.readLabel());
    }
}
