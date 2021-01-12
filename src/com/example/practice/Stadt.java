package com.example.practice;
import java.util.ArrayList;

public class Stadt {
    String Name;
    String Land;
    ArrayList<Temperatur> Temperaturen;

    @Override
    public String toString() {
        return "Stadt{" +
                "Name='" + Name + '\'' +
                ", Land='" + Land + '\'' +
                ", Temperaturen=" + Temperaturen +
                '}';
    }

    public Stadt(String name, String land, ArrayList<Temperatur> temperaturen) {
        Name = name;
        Land = land;
        Temperaturen = temperaturen;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }

    public ArrayList<Temperatur> getTemperaturen() {
        return Temperaturen;
    }

    public void setTemperaturen(ArrayList<Temperatur> temperaturen) {
        Temperaturen = temperaturen;
    }

    public void addTemperature(ArrayList<Temperatur> t){

        for(int counter = 0; counter < t.size();counter++){
            boolean isALready=false;

            for (int count = 0; count < this.Temperaturen.size();count++)
            {
                //System.out.println(this.Temperaturen.get(count));
                if(t.get(counter).getMonat()==this.Temperaturen.get(count).getMonat()){
                    this.Temperaturen.get(count).Wert=t.get(counter).Wert;
                    isALready=true;
                    //System.out.println(count);
                }


            }
            if(!isALready)
                this.Temperaturen.add(t.get(counter));
        }
    }
}
