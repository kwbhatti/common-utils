package com.chimpcentral.data;

class ConvertLong implements ConvertInterface {
	
	Long value = null;
	
	public ConvertLong(long value) {
		this.value = Long.valueOf(value);
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
		return value.intValue();
	}

	@Override
	public long toLong() {
		return value;
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
		ConvertLong convertLong = new ConvertLong(220922209808098098L);
		System.out.println(convertLong.toString());
		System.out.println(convertLong.toBoolean());
		System.out.println(convertLong.toShort());
		System.out.println(convertLong.toInteger());
		System.out.println(convertLong.toLong());
		System.out.println(convertLong.toDouble());
		System.out.println(convertLong.toFloat());
	}
}