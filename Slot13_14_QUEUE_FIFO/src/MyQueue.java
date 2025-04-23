/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyQueue {
    Node head,tail;

    public MyQueue() {
        this.head=this.tail=null;
    }
    
    public boolean isEmpty(){
        return this.head==null;
    }
    
    public void enqueue(int key){
        Node newnode= new Node(key);
        if(isEmpty()){
            head=tail=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    
    public int dequeue(){//xoa dau
        if(!isEmpty()){
            int temp=this.head.info;
            this.head=this.head.next;
            
            if(head==null){
                tail=null;
            }
            
            return temp;
        }
        return Integer.MIN_VALUE;
    }
    
    
    public int front(){
        if(!isEmpty()){
            int temp=this.head.info;
            
            return temp;
        }
        return Integer.MIN_VALUE;
        
    }
    
    public void display(){
        Node current=head;
        
            while(current!=null){
                System.out.print(current.info+" ");
                current=current.next;
            }
        
        
    }
    
    
}
