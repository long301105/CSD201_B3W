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

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

    /**
     *
     * @author tungi
     */
    Node head, tail;

    public MyQueue() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void enqueue(String id, String name, int age, double gpa) {
        Student stu = new Student(id, name, age, gpa);
        Node newnode = new Node(stu);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public Student dequeue() {
        if (!isEmpty()) {
            Student temp = this.head.info;
            this.head = this.head.next;

            if (head == null) {
                tail = null;
            }

            return temp;
        }
        return null;
    }

    public Student front() {
        if (!isEmpty()) {
            Student temp = this.head.info;

            return temp;
        }
        return null;
    }

    public void display() {
        Node current=head;
        
            while(current!=null){
                System.out.print(current.info+" ");
                current=current.next;
            }
    }
    
    public void findhighestgpa(){
        Node current=head;
        double maxgpa=current.info.getGpa();
        Student highstu=new Student();
        while(current!=null){
            if(maxgpa<current.info.getGpa()){
                maxgpa=current.info.getGpa();
                highstu=current.info;
            }
            current=current.next;
        }
        System.out.println(highstu);
    }
    
}
