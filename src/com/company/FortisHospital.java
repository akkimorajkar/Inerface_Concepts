package com.company;

public class FortisHospital implements UKMedical,USMedical,IndianMedical {


    @Override
    public void cancerServices() {

        System.out.println("Indian Medical Service Interface Cancer Service");

    }

    @Override
    public void neuroServices() {

        System.out.println("Indian Medical Service Interface neuro Service");

    }

    @Override
    public void pediatricServices() {

    }

    @Override
    public void entSerices() {

        System.out.println("UK Medical Service Interface ENT Service");

    }

    @Override
    public void cosmeticServices() {

        System.out.println("UK Medical Service Interface cosmetic Service");


    }

    @Override
    public void cardioServices() {

        System.out.println("ÜS Medical Service Interface Cardio Service");

    }

    @Override
    public void physioServie() {

        System.out.println("ÜS Medical Service Interface physio Service");

    }

    @Override
    public void emergencyService() {

        System.out.println("ÜS Medical Service Interface emergency Service");

    }

    @Override
    public void polioServices() { // When a method is present in all the Interfaces it is implemented in the class only Once. The signature of the method should be same.

        System.out.println(" ALL Medical Service Interface Mehtod polio Service");


    }

    public void medicalInsuranc(){

        System.out.println("Fortis Hospital medical Insurance service");


    }

    public void opdServices(){

        System.out.println("Fortis Hospital OPD service");


    }
}
