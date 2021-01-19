
import java.util.Scanner;
import java.util.Stack;

public class Demo{

 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        while(scanner.hasNext()){
            String input=scanner.nextLine();
            Stack<Character> lifo=new Stack<>();
            for(int i=0;i<input.length();i++){
                if(!lifo.isEmpty()){
                    switch(input.charAt(i)){
                        case '}':
                            if(lifo.peek()=='{'){
                                lifo.pop();
                            }
                            break;
                        case ']':
                            if(lifo.peek()=='['){
                                lifo.pop();
                            }break;
                        case ')':
                            if(lifo.peek()=='('){
                                lifo.pop();
                            }break;
                             default: lifo.push(input.charAt(i));
                            
                    }
                }
                else{
                    lifo.push(input.charAt(i));
                }
            }
            System.out.println(lifo.isEmpty()); 
            
        }
        
    }
    
}

