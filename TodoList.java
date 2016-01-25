public class TodoList {

	public static void main (String[] args){
		TaskList list = new TaskList();
	
	// ajoute 2 taches....
		list.addTask("Test");
		list.addTask("Test 2 ");
		
	//	renvoie les listes...
list.taskDone(0);
		System.out.println(list);
	}
}
