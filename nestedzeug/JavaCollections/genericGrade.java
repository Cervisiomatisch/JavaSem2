package nestedzeug.JavaCollections;

public class genericGrade<T extends Comparable<T>> {
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T avalue) {
        value = avalue;
    }
    public boolean isNotGrade(){
        return value == null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public < V extends Comparable<T>> String compareGrades(V aValue){
        if (aValue.compareTo(value) > 0){
            return aValue + " ist schlechter als " + value;
        } else if (aValue.compareTo(value) == 0){
            return aValue + " ist genau die selbe Note wie " + value;
        } else {
            return aValue + " ist besser als " + value;
        }
    }

}
