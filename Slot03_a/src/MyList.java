
import java.util.Random;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class MyList {

    Node head;

    public MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
//        if(this.head==null){
//            return true;
//        }
//        return false;
        return this.head == null;
    }

    public void clear() {
        this.head = null;

    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            System.out.print(" ");
            p = p.next;
        }
    }

    void loadData(int k){
        Random generator= new Random();
        for (int i = 0; i < k; i++) {
            int number= generator.nextInt(1000) + 1;
            addFirst(number);
        }
    }
    
    public void addFirst(int n){
        Node newNode= new Node(n);
        
        //addfirst
        newNode.next=head;
        head=newNode;
    }
    
    public void addLast(int n){
        Node newNode = new Node(n);
        //addLast
        //if list is empty, make the new node as head
        if(head == null){
            head= newNode;
            return;
        }
        //if list is not empty
        Node last= head;
        while(last.next != null){
            last= last.next;
        }
       //add the new node at the end
       last.next=newNode;
    }
    
    public void addPos(int n, int k){
        if(k==0){
             addFirst(n);
             return;
         }
         //find the node at position k-1
         int currentIndex=0;
         Node current=head;
         while (currentIndex<k-1 && current!=null) {             
             current=current.next;
             currentIndex++;
         }
         
         //insert newNode
         Node newNode= new Node(n);
         newNode.next=current.next;
         current.next=newNode;
    }
    
    
    void f1(){
        System.out.println("Linked List: ");
        this.traverse();
        
    }
    //f2: nnhap du lieu mot con so tu ban phim ==> addLast
    void f2(){
        System.out.println("");
        System.out.println("Before : ");
        this.traverse();
        //start ur code
        System.out.println("");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num= sc.nextInt();
        this.addLast(num);
        //end your code
        System.out.println("After: ");
        this.traverse();
    }
    
    //f3: ham addpos==> them Node vao vi tri thu k
     void f3(){
        
        System.out.println("Before : ");
        this.traverse();
        
        //start ur code
        System.out.println("");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int num= sc.nextInt();
         System.out.println("Enter position case: ");
         int k= sc.nextInt();
         
         addPos(num, k);
        
        //end your code
        System.out.println("After: ");
        this.traverse();
    }
    //f4: remove first
       void f4(){
        System.out.println("Before : ");
        this.traverse();
        //start ur code

        if(head != null){
            head= head.next;
        }
        
        //end your code
        System.out.println("After: ");
        this.traverse();
    }
       
       //f5: remove last
         void f5(){
        System.out.println("Before : ");
        this.traverse();
        //start ur code
        if(head!=null){
            //if there is only 1 element
            if(head.next==null){
                head=null;
            }else{
                Node secondlast=head;
                while(secondlast.next.next !=null){
                    secondlast=secondlast.next;
                }
            //remove last node
            secondlast.next=null;
        }
        }
       
        //end your code
        System.out.println("After: ");
        this.traverse();
    }
}
