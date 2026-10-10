import java.io.*;

public class Main {
    public static void main(String[] args){
        String filePath="C:\\Users\\rraju\\Downloads\\Raksha\\aksha.txt";
        try(FileWriter w=new FileWriter(filePath)){
            w.write("""
                    I m Billu
                    i live in Raksha house
                    she loves me so much 
                    that i relaly dont know she even exist
                    still i m gratefull for evrything she does to me
                    So by biting her i prove her that i love her
                    """);
            System.out.println("file written suceful");
            
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("somethig wentw rong");
        }
        try(BufferedReader bw =new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=bw.readLine())!=null){
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("specified fiel not found");
        }
        catch(IOException e){
            System.out.println("soemting went wrong");
        }
        hello he=new hello();
        he.hello();
    }
}
