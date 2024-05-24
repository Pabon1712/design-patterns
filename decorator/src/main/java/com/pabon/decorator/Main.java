package com.pabon.decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
        DataBase dbWithLogger = Config.getDatabase();
        Logger logger = Config.getLogger();

        dbWithLogger.insert("Registro1");
        dbWithLogger.insert("Registro2");

        List<String> registros = dbWithLogger.registers();
        System.out.println("Registros en la base de datos: " + registros);

        List<String> logs = logger.get();
        System.out.println("Logs: " + logs);
    }
}