import java.util.*;

public class StringRecipe {
    private List<StringTransformer> transformers = new ArrayList<>();
    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers=transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer transformer:transformers)
            transformer.execute(drink);
        }

    }

