public class unitTest {

    public static void testViewShowTodoList(String[] model) {
        AddModel.addToDoList("satu", model);
        AddModel.addToDoList("dua", model);
        AddModel.addToDoList("tiga", model);
        AddModel.addToDoList("empat", model);
        AddModel.addToDoList("lima", model);
        AddModel.addToDoList("enam", model);
        AddModel.addToDoList("tujuh", model);
        AddModel.addToDoList("delapan", model);
        AddModel.addToDoList("sembilan", model);
        AddModel.addToDoList("sepuluh", model);
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
