package database;

public class RepositoryFactory {

    public static Repository getInstance() {
        return FileRepository.getInstance();
    }

}
