package day31_Constructors.scrumTask;

public class Tester {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
}
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

 */
