class Student{
	String id;	
	String name;	
	int prfMarks;
	int dbmsMarks;
	
	Student(){
		
	}
	Student(String id, String name, int prfMarks, int dbmsMarks){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
	}
	public boolean equals(Student s1){
		return this.id.equalsIgnoreCase(s1.id);
	}
}
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
		Student tempstudentArray[]=new Student[studentArray.length+(int)(loadFact*studentArray.length)];
		for (int i = 0; i < studentArray.length; i++){
			tempstudentArray[i]=studentArray[i];
		}
		studentArray=tempstudentArray; 
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
	public void addFirst(Student student){
		add(0,student);
	}
	public void addLast(Student student){
		add(nextIndex,student);
	}
	public void add(int...intData){
		//
	}
	public void add(int index, int...intData){
		//
	}
	public void trimToSize(){
		Student[] tempstudentArray=new Student[size()];
		for (int i = 0; i < studentArray.length; i++){
			tempstudentArray[i]=studentArray[i];
		}
		studentArray=tempstudentArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
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
	public void removeFirst(){
		remove(0);
	}
	public void removeLast(){
		remove(size()-1);
	}
	public boolean remove(Student student){
		int index=search(student);
		if (indexfghd)
		{
			_
		}
		
	}	
	public int search(Student student){
		for (int i = 0; i < nextIndex; i++){
			if(studentArray[i].equals(student)){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print("("+studentArray[i].id+", "+studentArray[i].name+", "+studentArray[i].prfMarks+", "+studentArray[i].dbmsMarks+")");
		}
		System.out.println(isEmpty()? "empty]":"]");
	}
	public void display(int start){
		
	}
	public void display(int startIndex, int endIndex){
		
	}
	public int get(int index){
		return -1;
	}
	public int getFirst(){
		return -1;
	}
	public int getLast(){
		return -1;
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return studentArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		StudentList list1=new StudentList(12,0.25);
		list1.add(new Student("S001","Nethra",20,30)); //Insertion order
		list1.add(new Student("S002","Shithila",20,30));
		list1.add(new Student("S003","Esanda",20,30));
		list1.add(new Student("S004","Perera",20,30));
		list1.add(new Student("S005","Niroth",20,30));
		
		list1.display(); //[10,20,30,40,50 ........90]
		System.out.println("\nIndex of S003-Bimal : "+list1.search(new Student("S0003","Bimal",35,30))); //2
		
	}
}







