package com.chimpcentral.data;

class ConvertFloat implements ConvertInterface {
	
	Float value = null;
	
	public ConvertFloat(float value) {
		this.value = Float.valueOf(value);
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
		return value;
	}
	
	public static void main(String[] args) {
		ConvertFloat convertFloat = new ConvertFloat(2.22312323321232f);
		System.out.println(convertFloat.toString());
		System.out.println(convertFloat.toBoolean());
		System.out.println(convertFloat.toShort());
		System.out.println(convertFloat.toInteger());
		System.out.println(convertFloat.toLong());
		System.out.println(convertFloat.toDouble());
		System.out.println(convertFloat.toFloat());
	}
}