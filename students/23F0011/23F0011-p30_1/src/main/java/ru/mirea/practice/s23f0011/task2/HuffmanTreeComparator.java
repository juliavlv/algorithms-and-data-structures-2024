package ru.mirea.practice.s23f0011.task2;

import java.util.Comparator;

class HuffmanTreeComparator implements Comparator<HuffmanTreeNode> {
    public int compare(HuffmanTreeNode node1, HuffmanTreeNode node2) {
        return node1.freq - node2.freq;
    }
}
