package util;

import global.GlobalStrings;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Util {

    public static void writeWordsToDinamicArray(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(GlobalStrings.FILE_NAME))){
            String word = null;
            while ((word = bufferedReader.readLine()) != null){
                GlobalStrings.stringDinamicArray.add(word);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public static void writeScoreToDinamicArray(){
        try {
            File file = new File(GlobalStrings.SCORE_FILE_NAME);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String score = null;
            while ((score = bufferedReader.readLine() ) != null){
                GlobalStrings.stringDinamicArray.add(score);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void WordsFromUrl(){
        String urlPath = GlobalStrings.URL_PATH;
        try {
            URL url = new URL(urlPath);
            for (int i = 0; i < 10; i++){
                Scanner scanner = new Scanner(url.openStream());
                String randomWords = scanner.useDelimiter("\\A").nextLine().replace("[\"","").replace("\"]","");
                System.out.print(randomWords + " ");
                WriteToFile(randomWords);

            }



        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }



    public static void WriteToFile(String word){
        try(FileWriter fileWriter = new FileWriter(GlobalStrings.FILE_NAME,true)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(word);
            bufferedWriter.newLine();
            bufferedWriter.flush();


        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



    public static String getRandomWord(){
        Random random = new Random();
       int randomNumber = random.nextInt(GlobalStrings.stringDinamicArray.getSize());
       return GlobalStrings.stringDinamicArray.get(randomNumber);
    }
    }


