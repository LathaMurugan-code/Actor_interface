public class Trainer
{
String dept,institute;
private int salary = 10000;
public int getSalary()
{
return salary;
}
public void training()
{
System.out.println("conduct online class");
}
Trainer(String dept,String institute)
{
this.dept = dept;
this.institute = institute;
System.out.println("I am from " +this.institute+ "institute handling" +this.dept);
}
}
