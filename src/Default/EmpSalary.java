package Default;
//import java.util.Scanner;

public class EmpSalary {
String empName;
int empId;
int Level;
double basicpay;
double boa;
double bonus;
double PF ;
double Tax;
double taxrate;
double grosspay;
double netpay;

public double calGrosspay() {
	return(basicpay+boa+bonus-PF)*12;
}

public double calnetpay(EmpSalary emp) {
	this.Level=emp.Level;
	
	
	if(this.Level==1) {
		this.basicpay=7000;
		this.boa=5000;
		this.bonus=2000;
		this.PF=basicpay*0.12;
		this.grosspay=calGrosspay();
		System.out.println("GrossPay: " +emp.calGrosspay());
		
	}
	else if(this.Level==2) {
		this.basicpay=10000;
		this.boa=7000;
		this.bonus=2500;
		this.PF=basicpay*0.12;
		this.grosspay=calGrosspay();
		System.out.println("GrossPay: " +emp.calGrosspay());
		
			
	}
	else if(this.Level==3) {
		this.basicpay=12000;
		this.boa=9000;
		this.bonus=3000;
		this.PF=basicpay*0.12;
		this.grosspay=calGrosspay();
		System.out.println("GrossPay: " +emp.calGrosspay());
		
	}
	else if(this.Level==4){
		this.basicpay=15000;
		this.boa=10000;
		this.bonus=3500;
		this.PF=basicpay*0.12;
		this.grosspay=calGrosspay();
		System.out.println("GrossPay: " +emp.calGrosspay());
	}
	//public void TaxCal() {
	
		if(Tax<=250000) taxrate=0;
		if((Tax>250000)&&(Tax<=500000)) taxrate=0.05;
		if((Tax>500000)&&(Tax<=750000)) taxrate=0.10;
		if((Tax>750000)&&(Tax<=1000000)) taxrate=0.20;
		if((Tax>1000000)&&(Tax<=1250000)) taxrate=0.30;
		if((Tax>1250000)&&(Tax<=1300000)) taxrate=0.30;
		
		
	//}
	netpay= grosspay-(Tax*taxrate)/100;
	return netpay/12;
	
	
}
public static void main(String[] args) {
	EmpSalary emp=new EmpSalary();
	emp.empName="Patrtick";
	System.out.println("Employee Name : " +emp.empName);
	emp.empId=101;
	System.out.println("Employee ID:" +emp.empId);
	emp.basicpay=12000;
	System.out.println("BasicPay: " +emp.basicpay);
	emp.Level=3;
	System.out.println("Employee Level: " +emp.Level);
	double netpay=emp.calnetpay(emp);
	System.out.println("NetPay : " +netpay);
}





}
