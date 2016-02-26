import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.InputMismatchException;


public class MyScan {

    public String fileName;
    static Reader reader;
    static StringBuilder sB = new StringBuilder();;
    public MyScan (String fileName) throws FileNotFoundException{
        this.fileName = fileName;
        getStringBuff( fileName);



    }


    String next() {
        String s = "";

        int a = sB.indexOf(" ");
        int b = sB.indexOf("\r");


        if (a <0  ){
            if (b>=0)
                a =b;
            else return null;

        }
        if (b<a && b!=-1) a=b;
        System.out.println ("a "+a);
        s = sB.substring(0, a);
        sB.delete(0, a+1);
        return s;


    }


    String whoNext() {
        String s = "";



        int a = sB.indexOf(" ");
        int b = sB.indexOf("\r");


        if (a <0  ){
            if (b>=0)
                a =b;
            else return null;

        }
        // System.out.println ("a "+a);
        s = sB.substring(0, a);

        return s;


    }



    int nextInt() {
        if (hasNextInt()){
            try {

                return  Integer.parseInt(whoNext());
            } catch (InputMismatchException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;



    }
    String nextLine() {
        String s = "";
        if (hasNext()){

            s = sB.substring(0, sB.indexOf("\r"));
            sB.delete(0, sB.indexOf(" ")+1);
        }
        return s;


    }
    boolean hasNext(){
        int a = sB.indexOf(" ");
        int b = sB.indexOf("\r");


        if (a <0 && b<0  )
            return false;


        return true;
    }
    boolean hasNextInt(){
        try {
            Integer.parseInt(whoNext());;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    void useDelemiter(String s){
    }






    public static void getStringBuff(String path) throws FileNotFoundException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = new FileInputStream(path);
        int count = -1;
        byte[] buff = new byte[1000];
        try {
            while((count = is.read(buff))!=-1) {

                baos.write(buff,0,count);

            }
            sB.append(new  String(baos.toByteArray(),"UTF-8"));
            System.out.println (sB);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
