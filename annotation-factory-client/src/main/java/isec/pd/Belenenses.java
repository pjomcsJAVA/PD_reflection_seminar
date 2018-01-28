package isec.pd;


import isec.pd.annotation.Factory;

@Factory(
        id = "belenenses",
        type = Club.class
)
public class Belenenses implements Club {
    public int titles() {
        return 1;
    }
}
