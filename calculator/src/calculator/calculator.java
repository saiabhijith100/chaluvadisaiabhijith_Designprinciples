package calculator;
import java.util.*;
public class calculator {
static void add(int p,int o) {
		int k=p;
		int y=o;
		System.out.println("********");
		int z=k+y;
		System.out.println("*"+z+" *");
		System.out.println("********");
	}
static void sub(int p,int o) {
	System.out.println("********");
	int r=p-o;
	System.out.println("*"+r+"  *");
	System.out.println("********");
}
static void mul(int p,int o) {
	System.out.println("********");
	int b=p*o;
	System.out.println("*"+b+" *");
	System.out.println("********");
}
static void div(int p,int o) {
	System.out.println("********");
	int y=p/o;
	System.out.println("*"+y+" *");
	System.out.println("********");
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int t=0;
	while(t==0) {
	System.out.println("**********************Calculator****************************");
	System.out.println("*1)Addition                                                *");
	System.out.println("*2)Substration                                             *");
	System.out.println("*3)multiplication                                          *");
	System.out.println("*4)Division                                                *");
	System.out.println("************************************************************");
	int a=sc.nextInt();
	System.out.println("************************************************************");
	System.out.println("*enter two numbers                                         *");
	System.out.println("************************************************************");
	int p=sc.nextInt();
	int o=sc.nextInt();
	if(a==1) {
		add(p,o);
	}
	else if(a==2) {
		sub(p,o);
	}
	else if(a==3) {
		mul(p,o);
	}
	else if(a==4) {
		div(p,o);
	}
	else {
		System.out.println("please enter a valid instruction");
	}
	System.out.println("**********************Calculator****************************");
	System.out.println("*press 0 to do it again                                    *");
	System.out.println("**********************Calculator****************************");
	t=sc.nextInt();
	}


}
}
