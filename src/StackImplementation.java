import java.util.Arrays;

import javax.activity.InvalidActivityException;

public class StackImplementation implements StackInterface{

	private final int INCREMENT_FACTOR = 2; 
	
	private int elements[] = new int[10];
	
	private int stackPointer = 0; 

	private void resizeArrayOnDemand(){
		if(stackPointer == elements.length-1){
			elements = Arrays.copyOf(elements, elements.length * INCREMENT_FACTOR);
		}
	}
	
	@Override
	public void push(int value) {
		resizeArrayOnDemand();
		elements[stackPointer] = value;
		stackPointer++;
		
		
	}

	@Override
	public int pop() throws InvalidActivityException {
		if(stackPointer==0) throw new InvalidActivityException("");
		return elements[--stackPointer];
	}

	@Override
	public int size() {
		return stackPointer;
	}

	
	
}
