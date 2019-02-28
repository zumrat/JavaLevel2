package Lesson1.Obstacles;

import Lesson1.Competitors.Competitor;
import Lesson1.Competitors.Animal;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}