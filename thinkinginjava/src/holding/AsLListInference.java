package holding;

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsLListInference {
    public static void main(String[] args)
    {
    	List<Snow> snow1 = Arrays.asList(
    		new Crusty(), new Slush(), new Powder());
    	
    	// thinking in java 第四版说下面的代码不能通过编译，
    	// 但其实java se 8是可以的
    	List<Snow> snow2 = Arrays.asList(
    		new Light(), new Heavy());
    	
    	List<Snow> snow3 = new ArrayList<>();
    	Collections.addAll(snow3, new Light(), new Heavy());
    	
    	List<Powder> powder = Arrays.asList(
    		new Light(), new Heavy());
    }
}
