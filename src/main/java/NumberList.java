import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(){
        this.numbers = new ArrayList<>();
    }


    public int getNumberCount() {
        return this.numbers.size();
    }

    public void AddNumber(int newNumber) {
        this.numbers.add(newNumber);
    }

    public int getNumberAtIndex(int index) {

        return this.numbers.get(index);
    }
}
