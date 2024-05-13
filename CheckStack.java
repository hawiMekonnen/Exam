package question2;

public class CheckStack {
    public static void main(String [] args){
        Stack num=new Stack(4);
        num.push(45);
        num.push(56);
        num.push(78);
        num.push(34);
        num.pop();
        for(int i=0;i<= num.maxsize-1;i++){
            System.out.println(num.stackArray[i]);
        }
    }
}
