class StudentList{ //Collection of student objects
	private Student[] studentArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	StudentList(int initSize, double loadFact){
		studentArray=new Student[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		Student tempStudentArray[]=new Student[studentArray.length+(int)(loadFact*studentArray.length)];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray; 
	}
	private boolean isFull(){
		return nextIndex>=studentArray.length;
	}
	public void add(Student student){ //Insertion order
		if(isFull()){
			extendsArray();
		}
		studentArray[nextIndex++]=student;
	}
	public void add(int index,Student student){
		if(isFull()){
			extendsArray();
		}
		if(index>=0 && index<=nextIndex){
			for (int i = nextIndex-1; i >=index; i--){
				studentArray[i+1]=studentArray[i];
			}
			studentArray[index]=student;
			nextIndex++;
		}
	}
	public int size(){
		return nextIndex;
	}
	public void clear(){
		studentArray=new Student[initSize];
		nextIndex=0;
	}
	public void remove(int index){
		if(!isEmpty()){
			if(index>=0 && index<nextIndex){
				for(int i=index; i<nextIndex-1; i++){
					studentArray[i]=studentArray[i+1];
				}
			}	
			nextIndex--;
		}
	}
	public int search(Student student){
		for (int i = 0; i < nextIndex; i++){
			if(student.equals(studentArray[i])){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("{");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(studentArray[i].toString()+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b}");
	}
	public Student get(int index){
		return null;
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public boolean remove(Student student){
		int index=search(student);
		remove(index);
		return index!=-1;
	}
}
