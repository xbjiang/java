package innerclasses;

public class Parcel9 {
	// thinking in java 4th ��˵����������final
	// ʵ����JDK 1.8 ���ü�final�����ǲ������ܸı�
    public Destination destination(final String dest)
    {
    	// dest = "shit"; �����ǲ��е�
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
