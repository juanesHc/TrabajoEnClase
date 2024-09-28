package co.edu.uco.crosscutting.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelpersUnitTestCase {

	@Test
	void givenWantValidateIfObjectIsNullWhenObjectIsNullThenResultsIsTrue() {
		//arrange: Initial Context
		String object=null;
		
		//Act
		boolean result=ObjectHelper.isNull(object);
		
		//Assert
		assertTrue(result);
	}
	
	@Test
	void givenWantValidateIfObjectIsNotNullWhenObjectIsNullThenResultsIsFalse() {
		//arrange: Initial Context
		var object="";
		
		//Act
		boolean result=ObjectHelper.isNull(object);
		
		//Assert
		assertFalse(result);
	}
	@Test
	void givenWantGetOriginalValueIfObjectIsNotNullWhenObjectIsNotNullThenResultsTheSameObject() {
		//Arrange: Initial
		var object="Casa";
		var defaultValue="Default";
		
		//Act: Execute action
		var result=ObjectHelper.getDefault(object,defaultValue);
		
		//Assert: validate result
		assertEquals(object,result);
		
	}
	@Test
	void givenWantGetDefaultValueWhenObjectIsNullThenResultsIsDefaultObject() {
		//Arrange: Initial
		String object=null;
		var defaultValue="Default";
		
		//Act: Execute action
		var result=ObjectHelper.getDefault(object,defaultValue);
		
		//Assert: validate result
		assertEquals(defaultValue,result);
		
	}

}
