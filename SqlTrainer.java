class SqlTrainer extends Trainer
{
	SqlTrainer(){
super("sql","payilagam");
	}		
public static void main(String args[])
{
	Trainer traineekumar = new Trainer("CSE","payilagam");
SqlTrainer ram = new SqlTrainer();
System.out.println(ram.dept);
System.out.println(ram.institute);
ram.training();
ram.getSalary();
}
}