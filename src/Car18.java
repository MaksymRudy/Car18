public class Car18 {

    int age = 5;

    int power = 75;

    int turbo = 33;

    int getAge (){
        return age;
    }

    int calculateIndex () {
            return power * 10 + turbo; }

    int upgradePower (int newPower) {
        power = power + newPower;
        return power;

    }





}
