package com.example.javaBackenToReact.lists;

import com.example.javaBackenToReact.models.Scroll;

import java.util.ArrayList;
import java.util.List;

public class ScrollList {

    private List<Scroll> scrolls = new ArrayList<>();

    public List<Scroll> getScrolls() {
        return scrolls;
    }

    public void addScroll(Scroll scroll){
        scrolls.add(scroll);
    }


}
