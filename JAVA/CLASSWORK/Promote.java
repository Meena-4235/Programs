class Promote{
	public static void main(String args[]){
		byte b=42;
		char c='a';
		short s=1024;
		int i=5000;
		float f=5.67f;
		double d=0.12345;
		double result=(f*b)+(i/c)-(d*s);  //f*b,b is promtoted float and the result of subexpression is converted to float.then,if one operand is long the whole expression is promoted into long.
		System.out.println((f*b)+"+"+(i/c)+"-"+(d*s));
		System.out.println("reusult="+result);
	}
}
