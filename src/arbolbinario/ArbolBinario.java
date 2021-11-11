/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author gpucheta
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IBinaryTree tree = new BinaryTreeImpl();
        Nodo root = new Nodo(5);

        System.out.println("Ejemplo de árbol binario");
        System.out.println("Construyendo árbol binario con valor raíz " + root.getValue());

        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
    }
}
