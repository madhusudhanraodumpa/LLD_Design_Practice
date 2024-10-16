package Singleton.LoggerWithoutSingleTon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logger {
    private final String logFile = "c://Test//" + "SingleTon1.text";
    private PrintWriter writer;
    private static int count =0;
    public Logger(){
        try {
            FileWriter fw = new FileWriter(logFile,false);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {}

    }



   /* public File createFile()  {

        if(this.getFile() ==null) {

            this.setFile(file);
        }
        return this.getFile();
      *//*  File file = new File(filePath);

        PrintWriter pr = null;
        try {
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);
            if (this.getPath() == null) {
                String fileLocation = "c://Test//" + "SingleTon.text";
                File file = new File(fileLocation);
                file.getParentFile().mkdirs();
                Path path = Paths.get(fileLocation);
                this.setPath(path);
            }
        }catch (Exception  e){
            e.printStackTrace();
        }
        return this.getPath();*//*
    }*/

    public void printLog(String message,String logType)  {
        writer.println(logType+" : "+message);
        System.out.println(count++);
    }


}
