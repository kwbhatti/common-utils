package com.chimpcentral.data;

class ConvertShort implements ConvertInterface {
	
	Short value = null;
	
	public ConvertShort(short value) {
		this.value = Short.valueOf(value);
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
		return value;
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
		ConvertShort convertLong = new ConvertShort((short) 9956);
		System.out.println(convertLong.toString());
		System.out.println(convertLong.toBoolean());
		System.out.println(convertLong.toShort());
		System.out.println(convertLong.toInteger());
		System.out.println(convertLong.toLong());
		System.out.println(convertLong.toDouble());
		System.out.println(convertLong.toFloat());
	}
}