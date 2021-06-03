package _2_java_essential.homework06._2_local_classes.ex4;


class LocalClassesService {

    /**
     * 3)
     */
    public String getObjectInfo(Object o) {
        if(o instanceof Integer) {
            class MyInteger {
                private Integer value;

                MyInteger(Object o) {
                    this.value = (Integer) o;
                }

                @Override
                public String toString() {
                    return this.getClass().getSimpleName() + " - " + value;
                }
            }
            return new MyInteger(o).toString();
        } else if (o instanceof Double) {
            class MyDouble {
                private Double value;

                MyDouble(Object o) {
                    this.value = (Double) o;
                }

                @Override
                public String toString() {
                    return this.getClass().getSimpleName() + " - " + value;
                }
            }
            return new MyDouble(o).toString();
        } else if (o instanceof Character) {
            class MyChar {
                private Character value;

                MyChar(Object o) {
                    this.value = (Character) o;
                }

                @Override
                public String toString() {
                    return this.getClass().getSimpleName() + " - " + value;
                }
            }
            return new MyChar(o).toString();
        } else if (o instanceof String) {
            class MyString {
                private String value;

                MyString(Object o) {
                    this.value = (String) o;
                }

                @Override
                public String toString() {
                    return this.getClass().getSimpleName() + " - " + value;
                }
            }
            return new MyString(o).toString();
        }
        throw new IllegalArgumentException("Неизвестный тип");
    }
}
