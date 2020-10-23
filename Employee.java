import java.util.Scanner;
public class Employee {
	String Emp_name,Address,Mail_id;
	int Emp_id,Mobile_no;
	public Employee() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Emp name");
		Emp_name=sc.next();
		System.out.println("enter Address");
		Address=sc.next();
		System.out.println("enter Mail id");
		Mail_id=sc.next();
		System.out.println("enter Emp id");
		Emp_id=sc.nextInt();
		System.out.println("enter Mobile no");
		Mobile_no=sc.nextInt();
		
	}
	public void EmployeeDetails() {
		System.out.println("*****PAYSLIP*****");
		System.out.println("Emp name              :"+Emp_name);
		System.out.println("Emp id                :"+Emp_id);
		System.out.println("Mobile no             :"+Mobile_no);
		System.out.println("Address               :"+Address);
		System.out.println("Mail id               :"+Mail_id);
	}
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Opt one of the option you are looking for");
		System.out.println("(a)Programmer (b)AssistantProfessor (c)AssociateProfessor  (d)Professor");
		String desig=sc.next();
		switch(desig) {
		case "a":{
			Programmer p=new Programmer();
			p.EmployeeDetails();
			p.payslip();
			break;
		}
		case "b":{
			AssistantProfessor q=new AssistantProfessor();
			q.EmployeeDetails();
			q.payslip();
			break;
		}
		case "c":{
			AssociateProfessor r=new AssociateProfessor();
			r.EmployeeDetails();
			r.payslip();
			break;
		}
		case "d":{
			Professor r=new Professor();
			r.EmployeeDetails();
			r.payslip();
			break;
		}
		default:
			System.out.println("Enter one among a,b,c,d only");
		}
	}
}
class Programmer extends Employee{
	double basic_pay,DA,HRA,PF,stf,Net_salary,Gross_salary;
	public Programmer() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter basicpay of programmer");
		 basic_pay=sc.nextDouble();
		  DA=0.97*basic_pay;
		  HRA=0.1*basic_pay;
		  PF=0.12*basic_pay;
		  stf=0.1*basic_pay;
		  Net_salary=basic_pay+DA+HRA;
		  Gross_salary=basic_pay-(stf+PF);
	}
	public void payslip() {
		System.out.println("******AMOUNT*******");
		System.out.println("BASIC PAY OF EMPLOYEE     "+basic_pay);
		System.out.println("DA                        "+DA);
		System.out.println("HRA                       "+HRA);
		System.out.println("PF                        "+PF);
		System.out.println("STAFF CLUB FUND           "+stf);
		System.out.println("NET SALARY                "+Net_salary);
		System.out.println("GROSS SALARY              "+Gross_salary);
	}
}
class AssistantProfessor extends Employee{
	double basic_pay,DA,HRA,PF,stf,Net_salary,Gross_salary;
	public AssistantProfessor() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter basicpay of AssistantProfessor");
		 basic_pay=sc.nextDouble();
		  DA=0.97*basic_pay;
		  HRA=0.1*basic_pay;
		  PF=0.12*basic_pay;
		  stf=0.1*basic_pay;
		  Net_salary=basic_pay+DA+HRA;
		  Gross_salary=basic_pay-(stf+PF);
	}
	public void payslip() {
		System.out.println("******AMOUNT*******");
		System.out.println("BASIC PAY OF EMPLOYEE     "+basic_pay);
		System.out.println("DA                        "+DA);
		System.out.println("HRA                       "+HRA);
		System.out.println("PF                        "+PF);
		System.out.println("STAFF CLUB FUND           "+stf);
		System.out.println("NET SALARY                "+Net_salary);
		System.out.println("GROSS SALARY              "+Gross_salary);
	}
}
class AssociateProfessor extends Employee{
	double basic_pay,DA,HRA,PF,stf,Net_salary,Gross_salary;
	public AssociateProfessor() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter basicpay of AssociateProfessor");
		 basic_pay=sc.nextDouble();
		  DA=0.97*basic_pay;
		  HRA=0.1*basic_pay;
		  PF=0.12*basic_pay;
		  stf=0.1*basic_pay;
		  Net_salary=basic_pay+DA+HRA;
		  Gross_salary=basic_pay-(stf+PF);
	}
	public void payslip() {
		System.out.println("******AMOUNT*******");
		System.out.println("BASIC PAY OF EMPLOYEE     "+basic_pay);
		System.out.println("DA                        "+DA);
		System.out.println("HRA                       "+HRA);
		System.out.println("PF                        "+PF);
		System.out.println("STAFF CLUB FUND           "+stf);
		System.out.println("NET SALARY                "+Net_salary);
		System.out.println("GROSS SALARY              "+Gross_salary);
	}
}
class Professor extends Employee{
	double basic_pay,DA,HRA,PF,stf,Net_salary,Gross_salary;
	public Professor() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter basicpay of Professor");
		 basic_pay=sc.nextDouble();
		  DA=0.97*basic_pay;
		  HRA=0.1*basic_pay;
		  PF=0.12*basic_pay;
		  stf=0.1*basic_pay;
		  Net_salary=basic_pay+DA+HRA;
		  Gross_salary=basic_pay-(stf+PF);
	}
	public void payslip() {
		System.out.println("******AMOUNT*******");
		System.out.println("BASIC PAY OF EMPLOYEE     "+basic_pay);
		System.out.println("DA                        "+DA);
		System.out.println("HRA                       "+HRA);
		System.out.println("PF                        "+PF);
		System.out.println("STAFF CLUB FUND           "+stf);
		System.out.println("NET SALARY                "+Net_salary);
		System.out.println("GROSS SALARY              "+Gross_salary);
	}
}

