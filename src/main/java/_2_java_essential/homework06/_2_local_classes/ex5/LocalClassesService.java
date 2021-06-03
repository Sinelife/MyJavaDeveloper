package _2_java_essential.homework06._2_local_classes.ex5;

import java.util.*;

class LocalClassesService {
    /**
     * 4)
     */
    public void strangeOutput(Human... humans) {
        class Group {
            List<Human> humanList;

            Group() {
                humanList = new ArrayList<>();
            }

            private String getBiggerWord(String word1, String word2){
                if(word1.length() >= word2.length()){
                    return word1;
                }
                else {
                    return word2;
                }
            }

            private int firstLess(String word1, String word2){
                char[] chars1 = word1.toCharArray();
                char[] chars2 = word2.toCharArray();
                String biggerWord = getBiggerWord(word1, word2);
                for (int i = 0; i < biggerWord.length(); i++) {
                    if(chars1[i] < chars2[i]){
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return 1;
            }

            void add(Human human) {
                humanList.add(human);
                Collections.sort(humanList, new Comparator<Human>() {
                    @Override
                    public int compare(Human o1, Human o2) {
                        return firstLess(o1.getName(), o2.getName());
                    }
                });
            }

            @Override
            public String toString() {
                String res = "Group\n";
                for (Human human : humanList) {
                    res += human + "\n";
                }
                return res;
            }
        }
        class HumanGroup {
            private Human[] humans;
            private int size;

            HumanGroup() {
                this.humans = new Human[20];
                this.size = 0;
            }

            void add(Human human) {
                human.setName(human.getName() + "-толстый");
                humans[size] = human;
                size++;
            }

            @Override
            public String toString() {
                String res = "Human group\n";
                for (int i = 0; i < size; i++) {
                    res += humans[i] + "\n";
                }
                return res;
            }
        }
        Group groupMoreThan40 = new Group();
        HumanGroup group40 = new HumanGroup();
        List<Human> groupLessThan40 = new ArrayList<>();
        List<Human> buffer = new ArrayList<>();
        for (Human human : humans) {
            class HumanFinder {
                private String getBiggerWord(String word1, String word2){
                    if(word1.length() >= word2.length()){
                        return word1;
                    }
                    else {
                        return word2;
                    }
                }

                private boolean firstLess(String word1, String word2){
                    char[] chars1 = word1.toCharArray();
                    char[] chars2 = word2.toCharArray();
                    String biggerWord = getBiggerWord(word1, word2);
                    for (int i = 0; i < biggerWord.length(); i++) {
                        return chars1[i] > chars2[i];
                    }
                    return true;
                }

                Human getMaxAgeHuman(List<Human> humans) {
                    Human maxHuman = humans.get(0);
                    for (Human h : humans) {
                        if(h.getAge() >= maxHuman.getAge()) {
                            maxHuman = h;
                        }
                    }
                    return maxHuman;
                }

                Human getMaxNameHuman(List<Human> humans) {
                    Human maxHuman = humans.get(0);
                    for (Human h : humans) {
                        if(firstLess(maxHuman.getName(), h.getName())) {
                            maxHuman = h;
                        }
                    }
                    return maxHuman;
                }
            }
            HumanFinder finder = new HumanFinder();
            if(human.getAge() > 40) {
                groupMoreThan40.add(human);
            } else if (human.getAge() == 40) {
                group40.add(human);
            } else {
                buffer.add(human);
                groupLessThan40.clear();
                groupLessThan40.add(finder.getMaxAgeHuman(buffer));
                groupLessThan40.add(finder.getMaxNameHuman(buffer));
            }
        }
        System.out.println("More than 40 - " + groupMoreThan40);
        System.out.println("\n\n40 - " + group40 + "\n\n");
        System.out.println("Less than 40 - " + groupLessThan40);
    }


}
