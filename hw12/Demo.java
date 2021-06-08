package ua.tarasov.adv2.hw12;

import java.io.*;

public class Demo {
        public static String read(String path){
            BufferedReader reader = null;
            StringBuilder stringBuilder = null;
//открываем файл по пути
            try {
                reader = new BufferedReader( new FileReader(path));
                stringBuilder = new StringBuilder();
                String currentString;
//построчно считываем файл
                while ((currentString = reader.readLine()) != null ){
                    stringBuilder.append(currentString);
                    stringBuilder.append( "\n" );
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
//закрываем файл
                try {
                    assert reader != null;
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//возвращаем вычитанный текст в строке
            return stringBuilder.toString();

        }
        public static void main(String[] args) throws IOException {
            System. out .println( read ( "C:\\tast.txt" ));
        }
    }


