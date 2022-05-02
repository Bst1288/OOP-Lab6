public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numOfStudent;

	public Course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		// Auto increases array
		if(numOfStudent == students.length){
			String[] n = new String[students.length + 1];
			for(int i = 0; i < numOfStudent; i++){
				n[i] = students[i];
			}
			students = n;
		}
		students[numOfStudent] = student;
		numOfStudent++;
	}

	// Remove student
	public void dropStudent(String student){
		int index = findStudent(student);
		if(index >= 0)
			dropStudent(index);
		else
			System.out.println(student + " is not in the course: " + courseName);
	}
	// Returns the index if student is found
	private int findStudent(String student){
		for(int i = 0; i < numOfStudent; i++){
			if(students[i].equals(student))
				return i;
		}
		return -1;
	}

	//deletes Student
	private void dropStudent(int index){
		String[] s = new String[students.length - 1];
		for(int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index){
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numOfStudent--;
	}

	// removes all students
	public void clear(){
		students = new String[100];
		numOfStudent = 0;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumOfStudent() {
		return numOfStudent;
	}

	public String getCourseName() {
		return courseName;
	}
}