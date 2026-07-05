class List{
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	List(int initSize, double loadFact){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFact*dataArray.length)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray; 
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public void add(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void add(int index,int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void addFirst(int data){
		if(isFull()){
			extendsArray();
		}
	}
	public void addLast(int data){
		if(isFull()){
			extendsArray();
		}
	}
	public void trimToSize(){
		int[] tempDataArray=new int[size()];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
	}
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	public void remove(int index){
		if(!isEmpty()){
			//Insert code here
			nextIndex--;
		}
	}
	public void removeFirst(){
		if(!isEmpty()){
			//Insert code here
			nextIndex--;
		}
	}
	public void removeLast(){
		if(!isEmpty()){
			//Insert code here
			nextIndex--;
		}
	}
	public int search(int data){
		for (int i = 0; i < nextIndex; i++){
			if(dataArray[i]==data){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
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
		return dataArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		List list1=new List(12,0.25);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.add(100);
		list1.add(110);
		list1.add(120);
		list1.display(); //[10,20,30,40,50 ........120]
		System.out.println("Size      : "+list1.size()); //12
		
		list1.remove(3); //3->40
		list1.display(); //[10,20,30,50 ........120]
		System.out.println("Size      : "+list1.size()); //11
		System.out.println("Index of 50 : "+list1.search(50)); //3
	}
}
