import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    List<StringTransformer> transformers = new ArrayList<>();
    public StringTransformerGroup(List<StringTransformer> transformers) {

        this.transformers=transformers;
    }

    public void execute(StringDrink drink) {
        for (StringTransformer transformer:transformers)
            transformer.execute(drink);

    }


}
