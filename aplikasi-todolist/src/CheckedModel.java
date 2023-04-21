public class CheckedModel {
    public static String[] model = new String[10];
    public static void resizeModel(){
        var isFull = true;
        for (String s : model) {
            if (s == null) {
                isFull = false;
                break;
            }
        }

        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            System.arraycopy(temp, 0, model, 0, temp.length);
        }
    }
}
