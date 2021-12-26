public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink) {
        StringBuilder s= new StringBuilder(drink.getText());
        for(int j=0; j<s.length();j++){
            if(Character.isLowerCase(s.charAt(j))){
                s.setCharAt(j,Character.toUpperCase(s.charAt(j))); ;
            }
            else
                s.setCharAt(j,Character.toLowerCase(s.charAt(j)));
        }
        drink.setText(s.toString());
    }

    public void undo(StringDrink drink) {
        StringBuilder s= new StringBuilder(drink.getText());
        for(int j=0; j<s.length();j++){
            if(Character.isLowerCase(s.charAt(j))){
                s.setCharAt(j,Character.toUpperCase(s.charAt(j))); ;
            }
            else
                s.setCharAt(j,Character.toLowerCase(s.charAt(j)));
        }
        drink.setText(s.toString());
    }
}
