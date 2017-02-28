package com.symulakr.anchorchecker.models;

import java.util.Set;

public class Page {

    private String urlString;

    private Set<String> anchors;

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    public Set<String> getAnchors() {
        return anchors;
    }

    public void setAnchors(Set<String> anchors) {
        this.anchors = anchors;
    }
}
