import java.util.List;
import java.util.ArrayList;


public class MyList {
    //Estrutura de dados
    //Metodos Relacionados, add, remove, get, resolve etc
    private List<Integer> myList;
    private SortStrategy strategy;

    public void add(int x){
        this.myList = new ArrayList<Integer>();
        this.strategy = new QuickSortStrategy();
    }

    public void int getValue(int i){
        returt this.myList.get
    }

    public MyList() {
        this.myList = new ArrayList<Integer>();
        this.strategy = new QuickSortStrategy();

    }

    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }
    public void sort(){
        this.strategy.sort(this);
    }
}
