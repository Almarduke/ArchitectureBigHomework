package nju.architecture.server_demo.database_cluster.backup;

public class BackUp {

    public boolean backUp(Object data) {
        System.out.println("back up success");
        return true;
    }

    public boolean loadFromBackUp(String schemaName) {
        System.out.println("Data loaded from back up");
        return true;
    }
}
