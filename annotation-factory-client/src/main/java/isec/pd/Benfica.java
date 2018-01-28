package isec.pd;


import isec.pd.annotation.Factory;

@Factory(
        id = "benfica",
        type = Club.class
)
public class Benfica implements Club {
    @Override
    public int titles() {
        return 36;
    }
}
