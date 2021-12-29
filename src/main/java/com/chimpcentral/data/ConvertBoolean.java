package com.chimpcentral.data;

class ConvertBoolean implements ConvertInterface {
	
	Boolean value = null;
	
	public ConvertBoolean(boolean value) {
		this.value = Boolean.valueOf(value);
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public boolean toBoolean() {
		return value;
	}

	@Override
	public short toShort() {
		throw new ClassCastException();
	}

	@Override
	public int toInteger() {
		throw new ClassCastException();
	}

	@Override
	public long toLong() {
		throw new ClassCastException();
	}

	@Override
	public double toDouble() {
		throw new ClassCastException();
	}

	@Override
	public float toFloat() {
		throw new ClassCastException();
	}
	
	public static void main(String[] args) {
		ConvertBoolean convertBoolean = new ConvertBoolean(true);
		System.out.println(convertBoolean.toString());
		System.out.println(convertBoolean.toBoolean());
		System.out.println(convertBoolean.toShort());
		System.out.println(convertBoolean.toInteger());
		System.out.println(convertBoolean.toLong());
		System.out.println(convertBoolean.toDouble());
		System.out.println(convertBoolean.toFloat());
	}
}