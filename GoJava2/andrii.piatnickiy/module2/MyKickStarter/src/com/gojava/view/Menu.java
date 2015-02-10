package com.gojava.view;

import java.util.ArrayList;

import com.gojava.inputOutput.ConsoleIO;
import com.gojava.inputOutput.IO;
import com.gojava.projects.CategoryStorage;
import com.gojava.projects.ProjectStorage;

public class Menu {
    public ConsoleIO consoleIO = new ConsoleIO();
    private int currentLevelPosition;
    private Level1 level1;
    private Level2 level2;
    private Level3 level3;
    public int categoryPosition = 1; 

    
    private ArrayList<Level> levelsList = new ArrayList<>();


    public Menu(CategoryStorage categoryStorage, ProjectStorage projectStorage, ConsoleIO consoleIO) {
        this.consoleIO = consoleIO;
        this.level1 = new Level1(categoryStorage);
        this.level2 = new Level2(projectStorage);
        this.level3 = new Level3(projectStorage);
        level3.setMenu(this);
        add(level1);
        add(level2);
        add(level3);
        initMenu();
    }

    public void nextLevel(int nubberForNextLevel) {
        if ((nubberForNextLevel == 0 && currentLevelPosition == 1)
                || (nubberForNextLevel > 0 && currentLevelPosition == 3)) {
            consoleIO.print("not allowed to go below this level");
        } else {
            Level level; 
            if (nubberForNextLevel == 0) {
                currentLevelPosition--;
                if (currentLevelPosition == 2) {
                    nubberForNextLevel = categoryPosition;
                }
            } else {
                currentLevelPosition++;
                if (currentLevelPosition == 2) {
                    categoryPosition = nubberForNextLevel;
                }
            }
            level = getCurrentLevel();
            consoleIO.print(level.displayMySelf(nubberForNextLevel));
        }
    }

    public void add(Level level) {
        levelsList.add(level);
    }

    public void initMenu() {
        currentLevelPosition = 1;
        consoleIO.print(level1.displayMySelf(currentLevelPosition));
    }

    public Level getCurrentLevel() {
        Level result = null;
        for (Level level : levelsList) {
            if (currentLevelPosition == level.getPosition()) {
                result = level;
            }
        }
        return result;
    }
}
