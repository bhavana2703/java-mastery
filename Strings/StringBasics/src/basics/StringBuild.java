package basics;

import java.io.StringWriter;
import java.util.StringJoiner;

public class StringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.5 v , methds are not syncronized, to increce the performance
		// not thread safe

		StringBuilder sb = new StringBuilder("Java is a OO Programing Language");
		sb.append("30 years ").insert(4, "HBD");
		System.out.println(sb);

		// utilites
		// 1.format
		String name = "John";
		int age = 30;
		String result = String.format("Name: %s, Age: %d", name, age);
		System.out.println(result);

		// 2.StringJoiner  ---Join multiple strings with delimiter
		StringJoiner sj = new StringJoiner(",");
		sj.add("hello");
		sj.add("hey");
		sj.add("hi");
		System.out.println(sj);

		String joined = String.join(" | ", "Java", "Python", "Go");
		System.out.println(joined);

		// 3.StringWriter  --	Write to a string like a stream
		StringWriter writer = new StringWriter();
		writer.write("Hello ");
		writer.write("World!");

		System.out.println(writer.toString());

	}

}
