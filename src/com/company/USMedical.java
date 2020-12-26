package com.company;

public interface USMedical extends WHO{

    int minimumFee = 10; // All Variables are Static & Finalby default in an Interface

    public void cardioServices();

    public void physioServie();

    public void emergencyService();

    public void polioServices();

    public static void medicalDisplays(){ // U Can have static method in Interface bu then u need to give body to the method.7

        System.out.println("This is Static method in Interface UsMedical with the Body");

    }

    default void admin(){

        System.out.println("This method is default method in Interface & it can have Body as well even if defined in Interface");

    }




}
