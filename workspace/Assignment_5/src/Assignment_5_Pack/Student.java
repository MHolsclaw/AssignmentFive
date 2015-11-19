package Assignment_5_Pack;

public class Student {
	private String name;
	
	private double gpa;
	private final int SIZE = 4;
	private double [] weights = new double[SIZE];
	private double [] grades = new double[SIZE];
	private char letterGrade;
	
	public Student ()
	{
		name = "";
		grades = new double[SIZE];
		weights = new double[SIZE];
		gpa = 0;
	}

	public Student(String name, double[] grades, double[] weights) {
		this.name = name;
		this.grades = grades;
		this.weights = weights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getAssignments() {
		return grades;
	}

	public void setAssignments(double[] grades) {
		this.grades = grades;
	}

	public double getGpa() {
		return calculateAVGScore();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public char getLetterGrade() {
		return calculateLetterGrade();
	}
	
	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}
	
	private double calculateAVGScore()
	{
		double sum=0;
		if(grades != null)
		{
			for(int i=0; i<grades.length; i++)
			{
				sum+=(grades[i]*weights[i]);
			}
			this.gpa = sum;
		}
		return this.gpa;
		
	}
	
	private char calculateLetterGrade()
	{
		if(gpa>=90.0)
		{
			letterGrade = 'A';
		}
		if(gpa>=80.0 && gpa<90.0)
		{
			letterGrade = 'B';
		}
		if(gpa>=70.0 && gpa<80.0)
		{
			letterGrade = 'C';
		}
		if(gpa>=60.0 && gpa<70.0)
		{
			letterGrade = 'D';
		}
		if(gpa<60.0)
		{
			letterGrade = 'F';
		}
		return letterGrade;
	}
	
	public String toString()
	{
		String info = "";
		info = "Student Name: " + this.name + "\n"; 
		for(int i=0; i<grades.length; i++)
			{
			info+="\n Assignment " + (i+1) + "   " + grades[i] + "%   (" + weights[i] + ")"; 
			}
		info += "\n\nWeighted Grade:  " + getGpa() + "%\n";
		info += "Letter Grade:  " + getLetterGrade();
		return info;
	}
	
}
