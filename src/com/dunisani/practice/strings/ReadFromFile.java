package com.dunisani.practice.strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static void main(String[] args) {

        listFiles();


    }


    static void listFiles(){

        String fileName="C:/fortune-data.txt";
        List<String> fortunes=new ArrayList<>();

        try {

            File file= new File(fileName);
            BufferedReader br= new BufferedReader(new FileReader(file));

            String temp;

            while ((temp= br.readLine())!=null){

                fortunes.add(temp);

            }

            for (String fortune:fortunes){

                System.out.println(fortune);
            }

        }catch (IOException ex){

            ex.printStackTrace();
        }


    }
}
