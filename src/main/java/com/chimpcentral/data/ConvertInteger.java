package com.chimpcentral.data;

class ConvertInteger implements ConvertInterface {
	
	Integer value = null;
	
	public ConvertInteger(int value) {
		this.value = Integer.valueOf(value);
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public boolean toBoolean() {
		throw new ClassCastException();
	}

	@Override
	public short toShort() {
		return value.shortValue();
	}

	@Override
	public int toInteger() {
		return value;
	}

	@Override
	public long toLong() {
		return value.longValue();
	}

	@Override
	public double toDouble() {
		return value.doubleValue();
	}

	@Override
	public float toFloat() {
		return value.floatValue();
	}
	
	public static void main(String[] args) {
		ConvertInteger convertInteger = new ConvertInteger(2209222);
		System.out.println(convertInteger.toString());
		System.out.println(convertInteger.toBoolean());
		System.out.println(convertInteger.toShort());
		System.out.println(convertInteger.toInteger());
		System.out.println(convertInteger.toLong());
		System.out.println(convertInteger.toDouble());
		System.out.println(convertInteger.toFloat());
	}
}