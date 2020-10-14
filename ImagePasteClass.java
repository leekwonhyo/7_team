import java.io.*;
/**
 * Write a description of class ImagePasteClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImagePasteClass
{
    public static void main(String[] args){
        File f = new File("c:실습#3\\sunmoon.jpg");
        File paste = new File("c:실습#3\\Result\\sunmoon-copy.jpg");
        
        try{
            FileInputStream fi = new FileInputStream(f);
            BufferedInputStream in = new BufferedInputStream(fi, 20);
            
            FileOutputStream fo = new FileOutputStream(paste);
            BufferedOutputStream out = new BufferedOutputStream(fo, 20);
            int c;
            while((c = in.read()) != -1){
                out.write((byte)c);
            }
            System.out.println("입력 파일 : " + f.getPath() + " (파일크기 = " +
            f.length() + "바이트)");
            System.out.println("출력 파일 : " + paste.getPath() + " (파일크기 = " +
            paste.length() + "바이트)");
            
            fi.close();
            fo.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
