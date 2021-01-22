import java.util.Scanner;

abstract class Questioner{
    public void print_question(String question) {

    }
}

public class main {

    static class Carlson {
        String name_imen  = "Карлсон";
        String name_rod   = "Карлсона";
        String name_dat   = "Карлсону";
        String name_vinit = "Карлсона";
        String name_tvor  = "Карлсоном";
        String name_pred  = "Карлсоне";
    }

    public static void main(String[] args) {
//        И в это мгновение он услышал знакомое слабое жужжание у окна. Но Карлсона не было видно. Только маленькая
//        пухлая ручка вдруг мелькнула в окне и схватила плюшку с блюда. Малыш захихикал. Фрекен Бок ничего не заметила.
//        И тут он снова увидел, как та же маленькая пухлая ручка взяла еще одну плюшку с блюда. И Малыш снова
//        хихикнул. Он старался сдержаться, но ничего не получалось. Оказывается, в нем скопилось очень много смеха, и
//        этот смех неудержимо рвался наружу. Фрекен Бок с раздражением подумала, что он самый утомительный в мире
//        мальчик. Принесла же его нелегкая именно теперь, когда она собиралась спокойно попить кофейку.

        Questioner questioner = new Questioner(){
            public void print_question (String question){
                System.out.print(question + " > ");
            }
        };

        // Getting data from user stage
        System.out.println("Сначала ответьте на 3 вопроса, а потом узнайте, какой текст у вас получился");

        Scanner console_scanner = new Scanner(System.in);

        // Question 1: Jujjanie
        questioner.print_question("1. Сколько букв Ж в слове жужание будет хорошим числом букв Ж?");
        Jujjanie jujjanie = new Jujjanie();
        try {
            jujjanie.set_number_of_j(Integer.valueOf(console_scanner.nextLine()));
        } catch (TooManyJException e) {
            System.out.println("Слишком много 'ж', возвращение на стандартное значение");
        } catch (NumberFormatException e){
            System.out.println("Не похоже на число... Возвращение на стандартное значение");
        }

        // Question 2: плюшки
        Carlson carlson = new Carlson();
        questioner.print_question("2. Сколько плюшек съел " + carlson.name_imen + "?");
        try {
            if (Integer.valueOf(console_scanner.nextLine()) == 2)
                System.out.println("Правильно!");
            else
                System.out.println("Нет, он съел 2 плюшки");
        }
        catch (NumberFormatException e){
            System.out.println("Не похоже на число... Он съел 2 плюшки");
        }
        // Question 3: Hand
        questioner.print_question("3. Какая у карлсона рука - большая или маленькая? (small/big)");
        boolean is_hand_small = "small".equals(console_scanner.nextLine());
        if(!is_hand_small)
            throw new HandTooBigException("Вообще-то рука маленькая!", new Throwable());

        // Giving results to user stage
        System.out.println(
        "И в это мгновение он услышал знакомое слабое " + jujjanie.get_full_jujjanie() +
        " у окна. Но " + carlson.name_rod + " не было видно. Только маленькая\n" +
        "пухлая ручка вдруг мелькнула в окне и схватила плюшку с блюда. Малыш захихикал. Фрекен Бок ничего не заметила.\n" +
        "И тут он снова увидел, как та же маленькая пухлая ручка взяла еще одну плюшку с блюда. И Малыш снова\n" +
        "хихикнул. Он старался сдержаться, но ничего не получалось. Оказывается, в нем скопилось очень много смеха, и\n" +
        "этот смех неудержимо рвался наружу. Фрекен Бок с раздражением подумала, что он самый утомительный в мире\n" +
        "мальчик. Принесла же его нелегкая именно теперь, когда она собиралась спокойно попить кофейку.");
    }
}