package pack.life;

public class Human {
    int id;
    String name;
    int oklad;
    int savings;

    public Human(int id, String name, int oklad, int premiya) {
        this.id = id;
        this.name = name;
        this.oklad = oklad;
        this.savings = premiya;
    }

    public int getOklad() {
        return oklad;
    }

    public int getZP(int okladNow) {
        oklad = getOklad();
        return oklad;
    }

    public void goToBar() {
        savings = (int) (savings - 500 + Math.random() * 2500);
    }

    public void buyFood(int costOfFood) {
        savings = savings - costOfFood;
    }
}
