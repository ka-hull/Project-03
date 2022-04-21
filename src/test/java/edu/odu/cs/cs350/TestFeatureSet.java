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
		
		/**
		 * Test to see if a number is found in the token
		 */
		
		FeatureSet featureSet = new FeatureSet("4");
		assertFalse(featureSet.isIconic());
		assertFalse(featureSet.isPrefix());
		assertFalse(featureSet.isLast());
		assertFalse(featureSet.isFirst());
		
		/**
		 * Test to see if Mr is found in Prefix 
		 * Not the others
		 */
		
		FeatureSet featureSet1 = new FeatureSet("Mr");
		assertFalse(featureSet1.isIconic());
		assertTrue(featureSet1.isPrefix());
		assertFalse(featureSet1.isLast());
		assertFalse(featureSet1.isFirst());
		
		/**
		 * Test to see if Bridge is found in Iconic 
		 * Not the others
		 */
		
		FeatureSet featureSet2 = new FeatureSet("Bridge");
		assertTrue(featureSet2.isIconic());
		assertFalse(featureSet2.isPrefix());
		assertFalse(featureSet2.isLast());
		assertFalse(featureSet2.isFirst());
		
		/**
		 * Test to see if Potter is found in Last
		 * Not the others
		 */
		
		FeatureSet featureSet3 = new FeatureSet("Potter");
		assertFalse(featureSet3.isIconic());
		assertFalse(featureSet3.isPrefix());
		assertTrue(featureSet3.isLast());
		assertFalse(featureSet3.isFirst());
		
		/**
		 * Test to see if Harry is found in First 
		 * Not the others
		 */
		
		FeatureSet featureSet4 = new FeatureSet("Harry");
		assertFalse(featureSet4.isIconic());
		assertFalse(featureSet4.isPrefix());
		assertFalse(featureSet4.isLast());
		assertTrue(featureSet4.isFirst());
		
		/* old bad test for reference
		FeatureSet featureSet = new FeatureSet(toString());
		
		assertArrayEquals(Arrays.asList("Mr", "Miss"), featureSet.isPrefix());
		assertEquals(Arrays.asList("Bridge", "University"), featureSet);
		*/

}
