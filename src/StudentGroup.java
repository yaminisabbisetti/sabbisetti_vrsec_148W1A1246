import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int length;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
           this.length=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
           return students;
	}

	@Override
	public void setStudents(Student[] students) {
           
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
           if(index<0|| index>=length){
                throw IllegalArgumentException;
                return null;
           }
           else{
                return students[index];
           }
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
           if(student.equals(null) || index<0 || index>=length){
                throw IllegalArgumentException;
           }
           else{
                students[index]=student;
           }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
           if(student.equals(null)){
                throw IllegalArgumentException;
           }
           else{
                length=length+1;
                for(int i=0;i<=length;i++){
                    students[i+1]=students[i];
                }
                student[0]=student;
           }
	}
	@Override
	public void addLast(Student student) {
		// Add your implementation here
           if(student.equals(null)){
                throw IllegalArgumentException;
           }
           else{
                students[length]=student;
                length=length+1;
           }
	}
	@Override
	public void add(Student student, int index) {
		// Add your implementation here
           if(student.equals(null)){
                throw IllegalArgumentException;
           }
           else{
                length=length+1;
                for(int i=index;i<length-1;i++){
                     students[i]=students[i+1];
                }
                students[index]=student;      
           }
	}
	@Override
	public void remove(int index) {
		// Add your implementation here
           if(index<0 || index>=length){
                throw IllegalArgumentException;
           }
           else{
                for(int i=index;i<length;i++){
                     students[i]=students[i+1];
                }
                length=length-1;
           }
	}
	@Override
	public void remove(Student student) {
		// Add your implementation here
           int count=0; 
           if(student==null){
                 throw IllegalArgumentException;
           }
           else{
                for(int i=0;i<length;i++){
                     if(students[i].equals(student)){
                          for(int j=i;j<length-1;j++){
                              students[j]=students[j+1];
                          }
                          length=length-1;count++;
                          break;
                     }
                }
                if(count==0){
                     System.out.println("Student not exist");
                     throw IllegalArgumentException;
                }
           }           
	}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
           if(index<0 || index>=length){
                throw IllegalArgumentException;
           }
           else{
                length=index+1;
           }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
           if(student.equals(null)){
                throw IllegalArgumentException;
           }
           else{
                for(int i=0;i<length;i++){
                    if(students[i].equals(student)){
                         length=i+1;
                         break;
                    }
                }
           } 
	}
	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
           if(index<0 || index>=length){
                throw IllegalArgumentException;
           }
           else{
                for(int i=0;i<length-index+1;i++){
                     students[i]=students[length-index+i];
                }
                length=length-index+1;
           }
	}
	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
           if(student.equals(null)){
                throw IllegalArgumentException;
           }
           else{ 
                for(int i=0;i<length;i++){
                     if(students[i].equals(student)){
                          for(int j=0;j<length-index+1;j++){
                                students[j]=students[length-index+j];
                          }
                     }
                     length=length-index+1;
                     break;
                }
           }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
           Arrays.sort(students);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
           if(Date.equals(null)){
                throw IllegalArgumentException;
           }             
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
