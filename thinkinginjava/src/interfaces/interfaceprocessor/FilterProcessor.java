package interfaces.interfaceprocessor;
import interfaces.filters.*;

class FilterAdapter implements Processor {
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {return filter.name();}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Waveform w2 = new Waveform();
		Waveform w3 = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0f)), w);
		Apply.process(new FilterAdapter(new HighPass(1.0f)), w2);
		Apply.process(new FilterAdapter(new BandPass(1.0f, 1.0f)), w3);
	}
}