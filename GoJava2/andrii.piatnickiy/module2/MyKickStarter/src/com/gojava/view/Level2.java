package com.gojava.view;

import com.gojava.projects.ProjectStorage;

public class Level2 implements Level {
    private int position = 2;
    private ProjectStorage projectStorage;

    public Level2(ProjectStorage projectStorage) {
        this.projectStorage = projectStorage;
    }

    public void displayMySelf(int categoryNumber) {
        projectStorage.getAll(categoryNumber);
    }

    @Override
    public int getPosition() {
        return position;
    }

}
