public class unitTest {

    public static void testViewShowTodoList(String[] model) {
        ViewModel.viewShowToDoList(model);
    }

    public static void testRemoveTodoList(String[] model){
        AddModel.addToDoList("coba 1", model);
        AddModel.addToDoList("coba 2", model);
        AddModel.addToDoList("coba 3", model);

        var result = DeleteModel.removeToDoList(1, model);
        System.out.println(result);

        ViewModel.showToDoList(model);
    }

    public static void testInput(){
        var name = AplikasiToDoList.input("Nama");
        System.out.println("Hello " + name);
    }

    public static void testAddTodoList(String[] model){
        for (int i = 0; i < 25; i++) {
            AddModel.addToDoList("Contoh todo ke-"+i, model);
        }
        ViewModel.showToDoList(model);
    }
}
