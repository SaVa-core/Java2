package Lesson1;

public class Main {
    public static void main(String[] args)
    {
            Team team = new Team("Rocket", new Human("Bob"), new Cat("Vasya"), new Dog("Sharik"));
            Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(123));
            course.doIt(team);
            team.showWinners();
    }
}
