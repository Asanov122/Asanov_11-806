package empire.company;

import java.io.*;
import java.util.*;

public class OpenFile {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            //получаем файл
            File file = new File("/D:/EMPIRE228/Example.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            //создаем список сотоящий из String
            List<String> list = new ArrayList<>();

            //запускаем цикл записывающий каждую строку текста в список
            while (line != null) {
                list.add(line);
                //System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }

            //System.out.println(list);

            //запускаем цикл обрабатывающий каждый элемент списка list
            for (int i = 0; i < list.size(); i++) {
                //поиск определенных элементов
                int indexQ = list.get(i).indexOf("*");
                int indexG = list.get(i).indexOf("&");

                int indexD = list.get(i).indexOf("/");
                //System.out.println(index);
                //вывод обычного текста
                if (indexQ != -1) {
                    System.out.println(list.get(i).substring(indexQ + 1));
                }
                //завершение игры
                if (indexD != -1) {
                    break;
                }
                //переход между строк
                if (indexG != -1) {
                    int x = sc.nextInt();
                    String change = list.get(i);
                    int indexX = change.indexOf(x + ".");
                    change = change.substring(indexX + 3);
                    indexX = change.indexOf(" ");
                    change = change.substring(0, indexX);
                    i=Integer.parseInt(change)-2;
                    //System.out.println(i);
                }
            }
        }//что-то, что я не понял, но это важно
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}