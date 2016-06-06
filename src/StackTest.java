import javax.activity.InvalidActivityException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StackTest {

	private StackImplementation stackImplementation;

	@BeforeMethod
	public void initStackImplementation() {
		this.stackImplementation = new StackImplementation();
	}

	@Test
	public void testStackFirstElement() {
		this.stackImplementation.push(1);

		Assert.assertEquals(this.stackImplementation.size(), 1);
	}

	@Test
	public void testStack_checkSize_after_pop() throws InvalidActivityException {
		this.stackImplementation.push(1);
		int element = this.stackImplementation.pop();

		Assert.assertEquals(this.stackImplementation.size(), 0);
	}

	@Test(expectedExceptions = InvalidActivityException.class)
	public void testStack_Pop_failure() throws InvalidActivityException {
		int element = this.stackImplementation.pop();
	}

	@Test
	public void testStack_Pop_element() throws InvalidActivityException {
		this.stackImplementation.push(1);
		int element = this.stackImplementation.pop();

		Assert.assertEquals(element, 1);
	}

	@Test
	public void testStack_Pop_MultipleElementOrderAndValue() throws InvalidActivityException {
		this.stackImplementation.push(1);
		this.stackImplementation.push(2);
		this.stackImplementation.push(3);

		int element = this.stackImplementation.pop();

		Assert.assertEquals(element, 3);
		element = this.stackImplementation.pop();

		Assert.assertEquals(element, 2);
		element = this.stackImplementation.pop();

		Assert.assertEquals(element, 1);
	}
}
