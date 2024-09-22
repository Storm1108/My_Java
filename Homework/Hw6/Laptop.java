package Homework.Hw6;

import java.util.*;

public class Laptop implements Comparable<Laptop> {
    String name;
    String os;
    String colour;
    int ram;
    boolean ssd = false;
    int disk;
    int price;
    Laptop(){

    }
    Laptop(boolean isRand){
        if (isRand) {
            List<String> names = Arrays.asList("Asus", "MSI", "Lenovo", "HP", "Apple", "Samsung");
            List<String> oSs = Arrays.asList("Windows", "Linux");
            List<String> colours = Arrays.asList("черный", "белый", "голубой", "серый", "красный", "зеленый");
            List<Integer> rams = Arrays.asList(2048, 4096, 8192, 16384, 32768);
            List<Integer> disks = Arrays.asList(256, 512, 1024, 2048);
            name = names.get(new Random().nextInt(names.size()));
            os = oSs.get(new Random().nextInt(oSs.size()));
            colour = colours.get(new Random().nextInt(colours.size()));
            ram = rams.get(new Random().nextInt(rams.size()));
            disk = disks.get(new Random().nextInt(disks.size()));
            ssd = new Random().nextBoolean();
            price = new Random().nextInt(10000,300000);
        }
    }
    public void printInfo(){
        System.out.println(name + " || " +
                os + " || " +
                colour + " || " +
                ram + " || "+
                ssd + " || "+
                disk + " || "+
                price);
    }
    @Override
    public String toString() {
        return  name + " || " +
                os + " || " +
                colour + " || " +
                ram + " || "+
                ssd + " || "+
                disk + " || "+
                price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && ssd == laptop.ssd && disk == laptop.disk && price == laptop.price && Objects.equals(name, laptop.name) && Objects.equals(os, laptop.os) && Objects.equals(colour, laptop.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, os, colour, ram, ssd, disk, price);
    }

    public int getDisk() {
        return disk;
    }

    public int getRam() {
        return ram;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public int getPrice() {
        return price;
    }

    public String isSsd() {
        if (ssd){
            return "+++";
        }
        else return "---";
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    public int compareTo(Laptop o) {
        return this.getPrice() - o.getPrice();
    }
}
