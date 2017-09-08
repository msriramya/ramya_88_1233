import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {

	}

	public int getId() {

	}

	public void setId(int id) {
		Scanner sn= new Scanner(System.in);
		System.out.println("enter student id");
		id[temp]=sn.next();

	}

	public String getFullName() {
		System.out.println("student name = "+name[i]);

		

	}

	public void setFullName(String fullName) {    
		Scanner sn=new Scanner(System.in);
                System.out.println("enter student name");
		name[temp]=sn.next();
		   
	}

	public Date getBirthDate() {
System.out.println("student date of birth = "+dob[i]);
		 
	}

	public void setBirthDate(Date birthDate) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter date of birth");
		dob[temp]=sn.next();


	}

	public double getAvgMark() {
		System.out.println("student marks = "+marks[i]);
		

	}

	public void setAvgMark(double avgMark) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter marks");
		marks[temp]=sn.nextInt();

	}

	@Override
	public boolean equals(Object o) {

	}

	@Override
	public int hashCode() {

	}

	@Override
	public int compareTo(Object o) {

	}
}
