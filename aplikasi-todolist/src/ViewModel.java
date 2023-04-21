public class ViewModel {

    public static void showToDoList(String[] model) {
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var number = i + 1;

            if (todo != null){
                System.out.println(number + ". " + todo);
            }
        }
    }

    public static void viewShowToDoList(String[] model) {
        while (true) {
            showToDoList(model);
            System.out.println("Menu : ");
            System.out.println("1. Tambah ");
            System.out.println("2. Hapus ");
            System.out.println("x. Keluar ");

            var input = AplikasiToDoList.input("Pilih");
            if(input.equals("1")){
                viewAddTodoList(model);
            } else if (input.equals("2")) {
                viewRemoveTodoList(model);
            } else if (input.equalsIgnoreCase("x")){
                break;
            } else {
                System.out.println("Pilihan tidak ditemukan");
            }
        }

    }

    public static void viewAddTodoList(String[] model){
        System.out.println("Menambah TodoList");

        var todo = AplikasiToDoList.input("Todo (x Jika Batal)");

        if (todo.equalsIgnoreCase("x")){
            viewShowToDoList(model);
        } else {
            AddModel.addToDoList(todo, model);
        }
    }

    public static void viewRemoveTodoList(String[] model){
        System.out.println("Menghapus TodoList");

        var number = AplikasiToDoList.input("Nomor yang dihapus (x Jika Batal)");

        if (number.equalsIgnoreCase("x")){
            viewShowToDoList(model);
        } else {
            boolean isSuccess = DeleteModel.removeToDoList(Integer.valueOf(number), model);
            if (!isSuccess) {
                System.out.println("Gagal menghapus todolist karena melebihi jumlah data yang ada");
            }
        }
    }
}
