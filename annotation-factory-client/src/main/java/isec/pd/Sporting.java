package isec.pd;

import isec.pd.annotation.Factory;

@Factory(
        id ="sporting",
        type = Club.class
)
public class Sporting implements Club{
    @Override
    public int titles() {
        return 18;
    }
}
