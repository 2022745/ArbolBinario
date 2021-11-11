/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.io.Serializable;

/**
 *
 * @author gpucheta
 */
public class Nodo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int value;
    private Nodo left;
    private Nodo right;

    public Nodo() {

    }

    public Nodo(int value) {
        this.value = value;
    }

    public Nodo(int value, Nodo left, Nodo right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
}
