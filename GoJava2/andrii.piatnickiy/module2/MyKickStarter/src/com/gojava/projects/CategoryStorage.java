package com.gojava.projects;

import java.util.ArrayList;

public interface CategoryStorage {

    void add(String name, int categoryId);

    String getCategoryToString();

    Category getCategory(int index);

    ArrayList<Category> getList();
}
