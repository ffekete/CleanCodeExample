import java.util.Arrays;

import javax.activity.InvalidActivityException;

public class StackImplementation implements StackInterface{

	private final int INCREMENT_FACTOR = 2; 
	
	private int elements[] = new int[10];
	
	private int sp = 0; 

	private void resizeArrayOnDemand(){
		if(sp == elements.length-1){
			elements = Arrays.copyOf(elements, elements.length * INCREMENT_FACTOR);
		}
	}
	
	@Override
	public void push(int value) {
		resizeArrayOnDemand();
		elements[sp] = value;
		sp++;
		
		
	}

	@Override
	public int pop() throws InvalidActivityException {
		if(sp==0) throw new InvalidActivityException("");
		return elements[--sp];
	}

	@Override
	public int size() {
		return sp;
	}

	
	
}
