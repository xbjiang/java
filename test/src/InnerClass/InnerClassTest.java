package InnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class InnerClassTest {
    public static void main(String[] args)
    {
    	TalkingClock clock = new TalkingClock(1000, true);
    	clock.run();
    	JOptionPane.showMessageDialog(null, "Quit Program?");
    	System.exit(0);
    }
}

class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int t, boolean b)
	{
		interval = t;
		beep = b;
	}
	
	public void run()
	{
		ActionListener listener = new TimerPrinter();
		Timer timer = new Timer(interval, listener);
		
		timer.start();
	}
	
	class TimerPrinter implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			Date now = new Date();
			System.out.println("At the tone, the time is "+now);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}
