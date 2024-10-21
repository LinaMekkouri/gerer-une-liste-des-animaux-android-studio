package com.example.seance4;


public class Animal {
    private int Image;
    private String Name;
    private String Description;

    public Animal (int Image, String Name, String Description) {
        this.Image = Image;
        this.Name = Name;
        this.Description = Description;
    }
        public int getImage() { return Image; }
        public String getName () { return Name; }
        public String getDescription () { return Description;}

}
