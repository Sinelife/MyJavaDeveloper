package _2_java_essential.homework02.ex6;

import java.util.List;

class SortService {

    private List<Dragon> dragons;

    SortService(List<Dragon> dragons) {
        this.dragons = dragons;
    }

    void sort(int l, int r, String sortType) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(l, m, sortType);
            sort(m + 1, r, sortType);
            merge(l, m, r, sortType);
        }
    }


    private void merge(int l, int m, int r, String sortType)  {
        int n1 = m - l + 1;
        int n2 = r - m;

        Dragon[] L = new Dragon[n1];
        Dragon[] R = new Dragon[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = dragons.get(l + i);
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = dragons.get(m + 1 + j);
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lessOrEquals(L[i], R[j], sortType)) {
                dragons.set(k, L[i]);
                i++;
            } else {
                dragons.set(k, R[j]);
                j++;
            }
            k++;
        }
        while (i < n1) {
            dragons.set(k, L[i]);
            i++;
            k++;
        }
        while (j < n2) {
            dragons.set(k, R[j]);
            j++;
            k++;
        }
    }


    private boolean lessOrEquals(Dragon first, Dragon second, String sortType) {
        if (sortType.equals("age")) {
            return first.getAge() <= second.getAge();
        } else if (sortType.equals("hashcode")) {
            return first.getHash() <= second.getHash();
        } else {
            return firstLess(first.getName(), second.getName());
        }
    }

    private String getSmallerWord(String word1, String word2){
        return word1.length() <= word2.length() ? word1 : word2;
    }

    private boolean firstLess(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String smallerWord = getSmallerWord(word1, word2);
        for (int i = 0; i < smallerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            } else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return false;
    }
}
