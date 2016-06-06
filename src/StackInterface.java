import javax.activity.InvalidActivityException;


public interface StackInterface {
	public void push(int value);
	public int pop() throws InvalidActivityException;
	public int size();
}
