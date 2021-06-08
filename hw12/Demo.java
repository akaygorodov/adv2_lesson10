package ua.tarasov.adv2.hw12;

import java.io.*;

public class Demo {
        public static String read(String path) {

            StringBuilder stringBuilder = new StringBuilder();
            String currentString;

//открываем файл по пути и, после использования, автоматически закрываем
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//построчно считываем файл
                while ((currentString = reader.readLine()) != null) {
                    stringBuilder.append(currentString);
                    stringBuilder.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
//возвращаем вычитанный текст в строке
                return stringBuilder.toString();
            }

        }
        public static void main(String[] args) throws IOException {
            System. out .println( read ( "C:\\tast.txt" ));
        }
    }


