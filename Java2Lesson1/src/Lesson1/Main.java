package Lesson1;
import Lesson1.Competitors.*;
import Lesson1.Obstacles.*;

public class Main {
        public static void main(String[] args) {

            Competitor[] competitors = {new Human("Patrik"), new Cat("Mushi"), new Dog("Seb"),new Duck("Selly")};
            Obstacle[] obstacles = {new Cross(400), new Wall(1), new Water(2)};

            Team team = new Team("Winners", competitors);

            System.out.println("============created new team============");
            System.out.println(team.getTeamName());

            System.out.println("============greeting team members============");
            team.showResults();

            // new Course
            Course course = new Course(obstacles);

            System.out.println("============team goes to course============");
            course.doIt(team);

            System.out.println("============show team Results============");
            team.showResults();

            System.out.println("============team members finished course============");
            team.showMembersFinishedCourse();
        }
    }
