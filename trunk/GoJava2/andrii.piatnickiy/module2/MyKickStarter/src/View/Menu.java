package View;

import java.util.ArrayList;

import com.gojava.projects.ProjectManager;

public class Menu {
    ProjectManager manager = new ProjectManager();
    public int currentPosition = 1;
    public Level1 level1;
    public Level2 level2;
    public Level3 level3;
    int parrentLevelPositon;

    public ArrayList<Level> levelsList = new ArrayList<>();

    public Menu() {
        this.level1 = new Level1(manager, this);
        this.level2 = new Level2(manager, this);
        this.level3 = new Level3(manager, this);
        levelsList.add(level1);
        levelsList.add(level2);
        levelsList.add(level3);
    }

    public void nextLevel(int nubberForNextLevel) {
        
        if (nubberForNextLevel == 0) {
            levelUp();
            currentPosition--;
        } else {
            levelDown(this.levelsList, nubberForNextLevel);
        }
        this.parrentLevelPositon = nubberForNextLevel;
    }

    public void levelUp() {
        // TODO will realise body
    }

    public void levelDown(ArrayList<Level> levelsList, int nubberForNextLevel) {
        currentPosition++;
        for (Level level : levelsList) {
            System.out.println();
            if (currentPosition == level.getPosition()) {
                level.displayMySelf(nubberForNextLevel);
            }
            
            
            System.out.println("level.getPosition() = " + level.getPosition());
        }
        System.out.println("currentPosition = " + currentPosition);
    }
}
