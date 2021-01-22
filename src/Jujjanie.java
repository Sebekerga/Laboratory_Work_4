public class Jujjanie {
    private static final int max_j = 7;
    int number_of_j = 2;

    void set_number_of_j(int n) throws TooManyJException {
        if(n > max_j)
            throw new TooManyJException("yep, too much");
        number_of_j = n;
    }

    String get_full_jujjanie(){
        StrictlyJujjanie strictlyJujjanie = new StrictlyJujjanie();
        strictlyJujjanie.set_number_of_j(number_of_j);

        return "жу" + strictlyJujjanie.get_strict_jujjanie() + "ание";
    }

    class StrictlyJujjanie{
        int strict_number_of_j = 2;

        void set_number_of_j(int n){
            strict_number_of_j = n;
        }

        String get_strict_jujjanie(){
            String jujjanie = "";
            for(int i = 0; i < strict_number_of_j; i++)
                jujjanie += "ж";

            return jujjanie;
        }
    }
}