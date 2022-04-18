package edu.odu.cs.cs350;

import java.util.Arrays;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;




public class TestFeatureSet {

	@Test
	public void test() {
		
		FeatureSet featureSet = new FeatureSet(null);
		assertEquals(Arrays.asList("Mr", "Miss"), featureSet.isPrefix());
		assertEquals(Arrays.asList("Bridge", "University"), featureSet.isIconic());
		
		
	}

}
