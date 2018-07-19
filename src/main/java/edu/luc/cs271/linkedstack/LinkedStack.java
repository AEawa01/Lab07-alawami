package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;


public class LinkedStack<E> implements IStack<E> {
    /** The topmost node of this stack. The stack gets pushed down from here. */
    private Node<E> top;

    private int size = 0;

    @Override
    public E push(final E obj) {
        Node<E> nn = new Node<E>(obj, top);
        top = nn;
        size++;
        return obj;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E peakVal = top.data;
        top = top.next;
        size--;
        return peakVal;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public List<E> asList() {
        final ArrayList<E> result = new ArrayList<>(size);
        populateList(top, result); // TODO replace null with the right reference
        return result;
    }

    private void populateList(final Node<E> curr, final List<E> result) {
        if(curr == null){
            return;
        }
        else{
            result.add(curr.data);
            populateList(curr.next, result);
        }
    }

    @Override
    public List<E> asFifoList() {
        final ArrayList<E> result = new ArrayList<>(size);
        populateFifoList(top, result); // TODO replace null with the right reference
        return result;
    }

    private void populateFifoList(final Node<E> curr, final List<E> result) {
        if(curr == null){
            return;
        }
        else{
            E data = curr.data;
            populateFifoList(curr.next, result);
            result.add(data);
        }
    }
}
