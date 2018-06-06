package com.test.pattern.create.Builder;

/**
 * 建造者模式
 * */
public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		System.out.println(builder.getList().size());
	}
}
