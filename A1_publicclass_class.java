/*
	1.一个Java源文件中可以定义多个class
	2.编译之后，一个class就会对应生成一个class字节码文件
	3.在java文件中可以没有public类。如果有的话也只能有一个
	4.如果有public类，那么public类名必须和源文件的名字保持一致
	5.每个类中都可以编写入口main方法。例：想执行X类的main方法，就执行 java X
	6.这里只是测试一下方法，在实际的开发中，对于一个软件来说，一般入口只有1个

*/

class X 
{
	public static void main(String[] args){
		System.out.println("X执行了");
}

class Y 
{
	public static void main(String[] args){
		System.out.println("Y执行了");
}

class Z 
{
	public static void main(String[] args){
		System.out.println("Z执行了");
}


public class A1_publicclass_class {
}