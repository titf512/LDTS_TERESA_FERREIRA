public class StringInverter implements StringTransformer{

    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        s.reverse();
        drink.setText(s.toString());
    }

    public void undo(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        s.reverse();
        drink.setText(s.toString());
    }
}
