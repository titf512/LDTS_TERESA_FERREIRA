public class StringReplacer implements StringTransformer {

    private Character a,x,old;
    public StringReplacer(Character a, Character x) {
        this.a=a;
        this.x=x;
    }

    public void execute(StringDrink drink) {
        String s = drink.getText();
        s=s.replace(a,x);
        drink.setText(s);

    }


    public void undo(StringDrink drink) {
        String s = drink.getText();
        s=s.replace(x,a);
        drink.setText(s);

    }
}
