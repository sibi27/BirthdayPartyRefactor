package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

         //Place birthday party orders
         order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
         order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
         order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );

    }

    private static void order(String ... party){

        orderBalloons(party[0], party[1], party[2]);

        orderCake(party[3], party[4], party[5], party[6], party[7]);
    }

    private static void orderBalloons(String ... balloon){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloon[0] + ", " + balloon[1]  + ", " + balloon[2]);

    }

    private static void orderCake(String ... cake){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + cake[0] + ", " + cake[1]  + ", " + cake[2] + ", " + cake[3] + ", " + cake[4]);

    }

}
