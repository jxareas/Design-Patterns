package com.jxareas.singleton.data;

public class DataStore {

    private static volatile DataStore instance = null;

    private DataStore() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static DataStore getInstance() {
        if (instance == null) {
            synchronized (DataStore.class) {
                if (instance == null) {
                    instance = new DataStore();
                }
            }
        }
        return instance;
    }

}
