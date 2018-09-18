package ru.icc.td.tabbyxl2.model;

public class CategoryGroupException extends IllegalStateException {
    public CategoryGroupException(String categoryGroupName, String labelGroupName) {
        super(String.format(
                "Labels in the same group are belong more than one categories: \"%s\" and \"%s\"",
                categoryGroupName, labelGroupName)
        );
    }
}
