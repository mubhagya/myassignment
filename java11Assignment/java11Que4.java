package armnum;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
public class java11Que4
{
    public static void main(String args[]) throws Exception
    {
     var path="out/production/FileReaderDemo/details/StudentList.txt";
     String data=Files.readString(Path.of(path));
     System.out.println("Student names");
     System.out.println(data);
     System.out.println(" Total Student"+data.lines().count());
    }
}
