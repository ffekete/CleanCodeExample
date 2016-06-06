import javax.activity.InvalidActivityException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class StackTest {

	@Test
	public void stackFirstElement(){
		StackImplementation st = new StackImplementation();
		st.push(1);
		
		Assert.assertEquals(st.size(), 1);
	}

	@Test
	public void stackFirstElement_Pop_checkSize(){
		StackImplementation st = new StackImplementation();
		st.push(1);
		try {
			int element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(st.size(), 0);
	}

	
	@Test(expectedExceptions = InvalidActivityException.class)
	public void stackFirstElement_Pop_failure(){
		StackImplementation st = new StackImplementation();
		try {
			int element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void stackFirstElement_Pop_element(){
		StackImplementation st = new StackImplementation();
		st.push(1);
		int element = 0;
		try {
			element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals(element, 1);
	}
	
	@Test
	public void stackFirstElement_Pop_elementMultiple(){
		StackImplementation st = new StackImplementation();
		st.push(1);
		st.push(2);
		st.push(3);
		int element = 0;
		try {
			element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(element, 3);
		try {
			element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(element, 2);
		try {
			element = st.pop();
		} catch (InvalidActivityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(element, 1);
	}
}
