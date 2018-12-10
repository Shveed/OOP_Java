package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int op;
        File myFile = new File("D:\\Java Files\\TestFile.txt");
        System.out.println("Enter text");
        String text = sc.nextLine();
        if(!myFile.createNewFile()) {
            while (true) {
                show_menu();
                System.out.println("Enter operation");
                op = sc.nextInt();

                switch (op) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        file_write(myFile, text);
                        break;
                    case 2:
                        file_read(myFile);
                        break;
                    case 3:
                        file_overwrite(myFile, text);
                        break;
                    default:
                        System.out.println("Wrong operation.");
                        break;
                }
            }
        }
        else{
            System.out.println("Wrong path");
        }
    }

    private static void file_write(File myFile, String text){
        if(myFile.exists()){
            try(FileWriter writer = new FileWriter(myFile)){
                writer.append(text);
            }catch(IOException e){
                System.out.println("File not found");
            }
        }
        else{
            System.out.println("File doesn't exist");
        }
    }

    private static void file_read(File myFile){
        try(FileReader reader = new FileReader(myFile)) {
            int c;
            while((c = reader.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch(IOException e){
            System.out.println("File not found");
        }
        System.out.println();
        System.out.println("Successfully read.");
    }

    private static void file_overwrite(File myFile, String text) {
        try{
            FileWriter myWriter = new FileWriter(myFile, false);
            myWriter.write(text);
            for(int i=0; i<text.length(); i++){
                if(text.charAt(i) == '\n')
                    myWriter.append(System.getProperty("line.separator"));
                myWriter.append(text.charAt(i));
            }
            myWriter.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void show_menu(){
        System.out.println("1 - Write to File");
        System.out.println("2 - Read from File");
        System.out.println("3 - Overwrite in File");
        System.out.println("0 - Exit");
    }
}
