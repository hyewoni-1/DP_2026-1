package hw.ch20;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;
    private static final String RESET = "\u001B[0m";

    public BigChar(char charname){
        this.charname=charname;
        try {
            String filename="big"+charname+".txt";
            StringBuilder sb =new StringBuilder();
            for(String line: Files.readAllLines(Path.of(filename))){

                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();

        }catch(IOException e){

            this.fontdata=charname+"?";
        }

    }
    public void print() {
        System.out.print(fontdata);
    }
    
    public void print(String colorCode) {
        String[] lines = fontdata.split("\n");
        
        for (String line : lines) {
            
            System.out.println(colorCode + line + RESET);
        }
    }
}