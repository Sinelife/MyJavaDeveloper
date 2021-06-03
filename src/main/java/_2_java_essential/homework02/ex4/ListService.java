package _2_java_essential.homework02.ex4;

import java.util.*;

class ListService {


    /**
     * For ArrayList
     * Метод, который получает массив строк, куда будут записаны только самая длинная и самая короткая строки.
     */
    public String[] getMaxMinArray(ArrayList<String> list) {
        return new String[]{getMinString(list), getMaxString(list)};
    }

    private String getMaxString(ArrayList<String> list) {
        int maxLength = Integer.MIN_VALUE;
        String maxStr = "";
        for (String str : list) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                maxStr = str;
            }
        }
        return maxStr;
    }

    private String getMinString(ArrayList<String> list) {
        int minLength = Integer.MAX_VALUE;
        String minStr = "";
        for (String str : list) {
            if (str.length() < minLength) {
                minLength = str.length();
                minStr = str;
            }
        }
        return minStr;
    }


    /**
     * For ArrayList
     * Метод, который получет строку, которая образуеться из всех строк, в которых есть буква 'а'.
     */
    public String getStringsWithASum(ArrayList<String> list) {
        String res = "";
        for (String str : list) {
            if (str.contains("a") || str.contains("A")) {
                res += str;
            }
        }
        return res;
    }


    /**
     * For ArrayList
     * Метод, который получает список из строк, в которые входит каждая вторая строка.
     */

    public ArrayList<String> getListFromEverySecondElem(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }




    /**
     * For LinkedList
     * Метод, который получает массив строк, куда будут записаны только самая длинная и самая короткая строки.
     */
    public String[] getMaxMinArray(LinkedList<String> list) {
        return new String[]{getMinString(list), getMaxString(list)};
    }

    private String getMaxString(LinkedList<String> list) {
        int maxLength = Integer.MIN_VALUE;
        String maxStr = "";
        for (String str : list) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                maxStr = str;
            }
        }
        return maxStr;
    }

    private String getMinString(LinkedList<String> list) {
        int minLength = Integer.MAX_VALUE;
        String minStr = "";
        for (String str : list) {
            if (str.length() < minLength) {
                minLength = str.length();
                minStr = str;
            }
        }
        return minStr;
    }


    /**
     * For LinkedList
     * Метод, который получет строку, которая образуеться из всех строк, в которых есть буква 'а'.
     */
    public String getStringsWithASum(LinkedList<String> list) {
        String res = "";
        for (String str : list) {
            if (str.contains("a") || str.contains("A")) {
                res += str;
            }
        }
        return res;
    }


    /**
     * For LinkedList
     * Метод, который получает список из строк, в которые входит каждая вторая строка.
     */

    public LinkedList<String> getListFromEverySecondElem(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }







    /**
     * Метод, который получает массив строк, куда будут записаны только самая длинная и самая короткая строки.
     */
    public String[] getMaxMinArray(List<String> list) {
        return new String[]{getMinString(list), getMaxString(list)};
    }

    private String getMaxString(List<String> list) {
        int maxLength = Integer.MIN_VALUE;
        String maxStr = "";
        for (String str : list) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                maxStr = str;
            }
        }
        return maxStr;
    }

    private String getMinString(List<String> list) {
        int minLength = Integer.MAX_VALUE;
        String minStr = "";
        for (String str : list) {
            if (str.length() < minLength) {
                minLength = str.length();
                minStr = str;
            }
        }
        return minStr;
    }


    /**
     * Метод, который получет строку, которая образуеться из всех строк, в которых есть буква 'а'.
     */
    public String getStringsWithASum(List<String> list) {
        String res = "";
        for (String str : list) {
            if (str.contains("a") || str.contains("A")) {
                res += str;
            }
        }
        return res;
    }


    /**
     * Метод, который получает список из строк, в которые входит каждая вторая строка.
     */

    public List<String> getListFromEverySecondElem(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
