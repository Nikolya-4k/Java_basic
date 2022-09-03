package homework5_array.homework5_classes;
/*
1. Create class Cat
    1.1. Create class Cat
    1.2. Cat should have name (String), age (int), weight (int)
            1.3. Create getters and setters for each variable
            2. Implement method fight
            2.1. Create method - boolean fight(Cat anotherCat)
            2.2. Implement the method with the logic of fighting the cats
            that depends on weight, age and strength.
            The method should calculate the result of fighting, did we win(this)
            and if yes - return true, if no - return false
            Should calculate next condition:
            if cat1.fight(cat2) == true -> cat2.fight(cat1) == false
            3. Create 3 object of Cat
            3.1. In the method main create 3 object of type Cat, fill them with data
            4. Create 3 rounds of fight in pairs between the cats.
            5. The result of each fight print to the console
 */
public class FightCat
{
    public static class Cat
    {
        int age;
        int weight;
        int power;
        public Cat(int age, int weight, int power)
        {
            this.age = age;
            this.weight = weight;
            this.power = power;
        }

        public String winner(Cat nextCat)
        {

            if (this.age + this.weight + this.power > nextCat.age + nextCat.weight + nextCat.power)
            {
                return "WIN";
            }

            else
            {
                return "LOSE";
            }

        }
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat(5, 2, 3);
        Cat cat2 = new Cat(3, 4, 5);
        Cat cat3 = new Cat(2, 4, 3);

        String roundOne = (cat1.winner(cat2));
        System.out.println("Cat one: " + roundOne);

        String roundTwo = (cat2.winner(cat3));
        System.out.println("Cat two: " + roundTwo);

        String roundThree = (cat3.winner(cat1));
        System.out.println("Cat three: " + roundThree);
    }
}
