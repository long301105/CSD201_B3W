/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ADMIN
 */
public class Node {
//    private
//   public
//   protected
//  _______
    
    int info;
    Node next;
    
    //Default constructor (no parameter)
    public Node(){
        
    }
    //Constructor for a typical node
    public Node (int ìnfo,Node next){
        this.info=info; // data stored inside the node
        this.next=next;//link to the next node
    }
    public Node(int info){
        this.info=info;
    }

}
