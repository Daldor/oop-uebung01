package ueb01;

import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private Element head;

    @java.lang.Override
    public void push(char c) {
        if(head == null){
            head = new Element(c, null);
        } else{
            head = new Element(c, head);
        }
    }

    @java.lang.Override
    public char pop() {

        if(head == null){
            throw new NoSuchElementException();
        }
        char output = head.c;
        head = head.next;
        return output;
    }

    @java.lang.Override
    public int size() {
        Element it = head;
        int c = 0;

        while(it != null){
            c++;
            it = it.next;
        }
        return c;
    }
}
