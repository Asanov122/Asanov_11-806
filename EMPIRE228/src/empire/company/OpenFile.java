package empire.company;

import java.io.*;
import java.util.*;

public class OpenFile {

    public static void Open(String FilePath) throws IOException {

            Scanner sc = new Scanner(System.in);

            File file = new File(FilePath);

                FileReader fr = new FileReader(file);

                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                List<String> list = new ArrayList<>();
                    while (line != null) {
                        list.add(line);
                        //System.out.println(line);

                        line = reader.readLine();
                    }

                    //System.out.println(list);


                    for (int i = 0; i < list.size(); i++) {

                        int indexQ = list.get(i).indexOf("*");
                        int indexG = list.get(i).indexOf("&");

                        int indexD = list.get(i).indexOf("/");
                        //System.out.println(index);

                        if (indexQ != -1) {
                            System.out.println(list.get(i).substring(indexQ + 1));
                        }

                        if (indexD != -1) {
                            break;
                        }

                        if (indexG != -1) {
                            int x = sc.nextInt();
                            String change = list.get(i);
                            int indexX = change.indexOf(x + ".");
                            change = change.substring(indexX + 3);
                            indexX = change.indexOf(" ");
                            change = change.substring(0, indexX);
                            i = Integer.parseInt(change) - 2;
                            //System.out.println(i);
                        }
                    }

            }

        }
