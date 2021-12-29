package com.chimpcentral.data;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ConvertStringTests implements ConvertTests {

	@Override
	@Test
	public void convertToBoolean() {
		Assert.assertTrue(new Data("true").convert().toBoolean() == true);
	}

	@Override
	@Test
	public void convertToDouble() {
		Assert.assertTrue(new Data("2.22312321232432423423321").convert().toDouble() == 2.22312321232432423423321);
	}

	@Override
	@Test
	public void convertToFloat() {
		Assert.assertTrue(new Data("2.22312323321232").convert().toFloat() == 2.22312323321232f);
	}

	@Override
	@Test
	public void convertToInteger() {
		Assert.assertTrue(new Data("-2147483648").convert().toInteger() == -2147483648);		
	}

	@Override
	@Test
	public void convertToLong() {
		Assert.assertTrue(new Data("21474836482147483").convert().toLong() == 21474836482147483L);		
	}

	@Override
	@Test
	public void convertToShort() {
		Assert.assertTrue(new Data("32767").convert().toShort() == 32767);		
	}

	@Override
	@Ignore
	@Test
	public void convertToString() {		
	}	
}
