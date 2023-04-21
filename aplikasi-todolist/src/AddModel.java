public class AddModel {
    public static void addToDoList(String todo, String[] model) {
        CheckedModel.resizeModel();
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

}
