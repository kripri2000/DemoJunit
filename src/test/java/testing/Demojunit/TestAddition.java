package testing.Demojunit;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

public class TestAddition {
	Addition a = new Addition();

	@Test
	public void testAdd() {
		assertEquals(5,a.add(2, 3));
	}

}
