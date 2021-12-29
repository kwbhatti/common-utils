package com.chimpcentral.data;

class ConvertString implements ConvertInterface {
	
	String value = null;
	
	public ConvertString(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public boolean toBoolean() {
		return Boolean.parseBoolean(value);
	}

	@Override
	public short toShort() {
		return Short.parseShort(value);
	}

	@Override
	public int toInteger() {
		return Integer.parseInt(value);
	}

	@Override
	public long toLong() {
		return Long.parseLong(value);
	}

	@Override
	public double toDouble() {
		return Double.parseDouble(value);
	}

	@Override
	public float toFloat() {
		return Float.parseFloat(value);
	}
	
	public static void main(String[] args) {
		ConvertString convertString;
		convertString = new ConvertString(null);
		System.out.println(convertString.toString());
		convertString = new ConvertString("true");
		System.out.println(convertString.toBoolean());
		convertString = new ConvertString("3434");
		System.out.println(convertString.toShort());
		convertString = new ConvertString("343443333");
		System.out.println(convertString.toInteger());
		convertString = new ConvertString("343434243234324");
		System.out.println(convertString.toLong());
		convertString = new ConvertString("34343.4243234324");
		System.out.println(convertString.toDouble());
		convertString = new ConvertString("343.34324");
		System.out.println(convertString.toFloat());
	}
}