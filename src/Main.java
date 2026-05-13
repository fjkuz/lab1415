import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("ВВведите строку, в которой нужно найти IP:");
    String str = scan.nextLine();
    Pattern pattern = Pattern.compile("\\b(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
    Matcher matcher = pattern.matcher(str);
    if (matcher.find()) {
      String ip = matcher.group();
      System.out.println("IP найден: " + ip);
      try {
        File file = new File("C://lab", "lab15.txt");
        if (file.createNewFile())
          System.out.println("файл создан");
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C://lab/lab15.txt"))){
          bw.write(ip);
        }
        }
      catch(IOException ex){System.out.println(ex.getMessage());}
    } else
      System.out.println("IP не найден");
  }
}
//Scanner scan=new Scanner(System.in);
//    System.out.println("ВВведите строку, в которой нужно найти IP:");
//    String str=scan.nextLine();
//    Pattern pattern=Pattern.compile("\\b(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
//    Matcher matcher=pattern.matcher(str);
//    if(matcher.find())
//      System.out.println("IP найден: "+matcher.group());
//    else
//      System.out.println("IP не найден");