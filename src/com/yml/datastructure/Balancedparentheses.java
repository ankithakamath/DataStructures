package com.yml.datastructure;

class Stack<T>{
	char data[];
	int top=0;
	Stack(){
		data =  new char[100];
	}
	
	public void push(char a) {
		data[top]= a;
		top++;
		
	}
	public char pop() {
		top--;
		char b=data[top];
		return b;
	}
	public char peek() {
		char c=data[top-1];
		return c;
		
	}
	public boolean isEmpty(){
		if(top==0)
				return true;
		return false;
	}
	public int size() {
		return top;
	}
}




public class Balancedparentheses<T> {
	
	Stack<Character> stack = new Stack<>();
	

	public <T> void isBalanced(String expr) {
		

		for(int i=0;i<expr.length();i++) {
			if(expr.charAt(i)=='(') {
				stack.push(expr.charAt(i));
			}
			else if(expr.charAt(i)==')'){
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}
		
	}
	
	public static void main(String[] args) {
		String  expr= "(5+6∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		
		Balancedparentheses obj = new Balancedparentheses();
		obj.isBalanced(expr);

	}

	


}
