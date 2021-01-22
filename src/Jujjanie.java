public class Jujjanie {
    private static final int max_j = 7;
    int number_of_j = 2;

    void set_number_of_j(int n) throws TooManyJException {
        if(n > max_j)
            throw new TooManyJException("yep, too much");
        number_of_j = n;
    }

    String get_full_jujjanie(){
        String jujjanie = "жу";
        for(int i = 0; i < number_of_j; i++)
            jujjanie += "ж";
        jujjanie += "ание";

        return jujjanie;
    }
}