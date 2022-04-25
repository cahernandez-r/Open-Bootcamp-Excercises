package principal;

public class Main {
    public static void main(String[] args) {

        CocheCRUD implementacion = new CocheCRUDImpl();
        implementacion.save();
        implementacion.delete();
    }
}
