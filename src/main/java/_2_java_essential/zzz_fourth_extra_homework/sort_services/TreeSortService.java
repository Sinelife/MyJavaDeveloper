package _2_java_essential.zzz_fourth_extra_homework.sort_services;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class TreeSortService<E extends AbstractEntity> extends AbstractSortService implements SortService<E> {

    @Override
    public void sort(E[] array) {
        treeSort(array);
    }

    private void treeSort(E[] array) {
        treeIns(array);
        inorderRec(root);
        root = null;
    }

    private class Node {
        E key;
        Node left, right;

        private Node(E item) {
            key = item;
            left = right = null;
        }
    }

    private Node root = null;

    private void insert(E key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, E key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

    private void treeIns(E[] arr) {
        for (E value : arr) {
            insert(value);
        }
    }
}
