import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.generics.Employee;

public class CompraractorDemo implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		int value=0;
		if(e1.getEsalary()>e2.getEsalary()) 
		{
			value=1;
		}
		else if(e1.getEsalary()<e2.getEsalary()) {
			value=-1;
			
		}else if(e1.getEsalary()==e2.getEsalary()) {
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("swathi");
		e1.setEsalary(30000);
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("ahaan");
		e2.setEsalary(40000);
		
		Employee e3=new Employee();
		e3.setEid(3);
		e3.setEname("jyothi");
		e3.setEsalary(50000);
		
		Employee e4=new Employee();
		e4.setEid(4);
		e4.setEname("sujith");
		e4.setEsalary(35000);
		
		Employee e5=new Employee();
		e5.setEid(5);
		e5.setEname("sagar");
		e5.setEsalary(25000);
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new CompraractorDemo());
		for(Employee e:list) {
			System.out.println("eid:"+e.getEid()+"\n"+"ename:"+e.getEname()+"\n"+"esalary:"+e.getEsalary());
		}
	}

	

}
