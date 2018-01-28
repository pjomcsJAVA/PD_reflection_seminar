package isec.pd;

import isec.pd.annotation.Factory;

@Factory(id="porto",
        type = Club.class
)
public class Porto implements Club{
    @Override
    public int titles() {
        return 27;
    }
}
