package com.msaggik.fifthlessonconstructioncalculator;

import java.io.Serializable;

public class Wallpaper implements Serializable {

    // поля
    private int widthWallpaper; // ширина рулона обоев
    private int heightWallpaper; // длина обоев в одном рулоне
    private int costWallpaper; // стоимость одного рулона обоев

    // конструктор
    public Wallpaper(int widthWallpaper, int heightWallpaper, int costWallpaper) {
        this.widthWallpaper = widthWallpaper;
        this.heightWallpaper = heightWallpaper;
        this.costWallpaper = costWallpaper;
    }

    // геттеры и сеттеры
    public int getWidthWallpaper() {
        return widthWallpaper;
    }
    public void setWidthWallpaper(int widthWallpaper) {
        this.widthWallpaper = widthWallpaper;
    }
    public int getHeightWallpaper() {
        return heightWallpaper;
    }
    public void setHeightWallpaper(int heightWallpaper) {
        this.heightWallpaper = heightWallpaper;
    }
    public int getCostWallpaper() {
        return costWallpaper;
    }
    public void setCostWallpaper(int costWallpaper) {
        this.costWallpaper = costWallpaper;
    }
}
