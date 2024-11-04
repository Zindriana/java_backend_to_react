package com.example.javaBackenToReact.lists;

import com.example.javaBackenToReact.models.Scroll;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScrollList {

    private List<Scroll> scrolls = new ArrayList<>();

    public List<Scroll> getScrolls() {
        return scrolls;
    }

    public void addScroll(Scroll scroll){
        this.scrolls.add(scroll);
    }


}
