import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner date = new Scanner(System.in);
        System.out.println("오늘 날짜를 입력하시오(년/월/일) : ");
        String s = date.next();
        StringTokenizer token1 = new StringTokenizer(s, "/");
        
        MyStack stack = new MyStack();
        System.out.println("------ Push ------");
        for(int i = 0; i < 3; i++){
            stack.push(token1.nextToken());
            System.out.println(stack[i]);
        }
        
        System.out.println("------ Pop ------");
        for(int j = 0; j < 4; j++){
            stack.pop(token1.nextToken());
            System.out.println(stack[j]);
        }
    }
}
