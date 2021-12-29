package com.chimpcentral.data;

class ConvertDouble implements ConvertInterface {
	
	Double value = null;
	
	public ConvertDouble(double value) {
		this.value = Double.valueOf(value);
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
		ConvertDouble convertDouble = new ConvertDouble(2.22312321232432423423321);
		System.out.println(convertDouble.toString());
		System.out.println(convertDouble.toBoolean());
		System.out.println(convertDouble.toShort());
		System.out.println(convertDouble.toInteger());
		System.out.println(convertDouble.toLong());
		System.out.println(convertDouble.toDouble());
		System.out.println(convertDouble.toFloat());
	}
}