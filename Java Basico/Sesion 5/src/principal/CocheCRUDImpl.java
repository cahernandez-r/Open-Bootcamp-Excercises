package principal;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Soy el metodo save");
    }

    @Override
    public void delete() {
        System.out.println("Soy el metodo delete");
    }
}
