public class oefeningen {

    //als x >= 0 dan druk "positief" anders druk "negatief"
    public void een(int x){
        if (x >= 0){
            System.out.println("positief");
        }
        else {
            System.out.println("negatief");
        }
    }

    //als temp <= 10 dan druk "koud"als temp tussen 10 en 20 ligt dan druk "goed" als temp >= 20 dan druk "warm"
    public void twee(int temp){
        if (temp <= 10){
            System.out.println("koud");
        } else if (temp < 20){
            System.out.println("goed");
        } else {
            System.out.println("warm");
        }
    }

    //als x >= 0 en even dan druk "positief en even"als x >= 0 en oneven dan druk "positief en oneven" als x < 0 en even dan druk "negatief en even"als x < 0 en oneven dan druk "negatief en oneven"
    public void drie(int x){
        if (x % 2 == 0){
            if (x >= 0){
                System.out.println("positief even");
            } else {
                System.out.println("negatief even");
            }
        } else {
            if (x >= 0){
                System.out.println("positief oneven");
            } else {
                System.out.println("negatief oneven");
            }
        }
    }

    //De conditionele operator (?:)
    public void condOp(int aantal){
        System.out.println(aantal == 1 ? "student" : "studenten");
    }

    //indhoud a,b,c
    public void vier(){
        int a=0,b=0,c=0;
        //a = ++b + ++c; //2


        //a = b++ + c++; //0

        //a = ++b + c++; //1
        a = b-- + c--; //0


        System.out.println(a);
    }

    public void verbeter(){
        int x=1;
        int total = 0;
        while (x <= 10){
            total += x;
            ++x;
            System.out.println("in");
        }
        System.out.println("done");
    }

}



