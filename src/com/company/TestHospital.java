package com.company;

public class TestHospital {

    public static void main (String[] args){

        FortisHospital fh = new FortisHospital();
        fh.cancerServices();
        fh.cardioServices();
        fh.cosmeticServices();
        fh.emergencyService();
        fh.entSerices();
        fh.neuroServices();
        fh.pediatricServices();
        fh.physioServie();
        fh.polioServices();

        // below two methods can only be called by reference of the class in which they are present & not by any other ref
        //Since they ae unique to the class
        fh.medicalInsuranc();
        fh.opdServices();

        System.out.println("---------------------------------");

        //Top casting of Interface

        // When Doing Top Casting Only the methods present in the Interface whose ref is created can be accessed
        // Not all methods from Diff interfaces can be accessed & not even the ones that are unique to the Class can be accessed
        // This is because of Ref Type Check.

        USMedical us = new FortisHospital();
        us.cardioServices();
        us.emergencyService();
        us.physioServie();
        us.polioServices();
        /*us.opdServices();   // This cannot be done because of Referrence Type Check.
        us.medicalInsurance();*/

        UKMedical uk = new FortisHospital();
        uk.cosmeticServices();
        uk.entSerices();
        uk.polioServices();

        // Down Casting is not possible since we cannot create th Object of Interface

        //FortisHospital fh1 = new USMedical(); // This is not possible at all nor Compile time nor Run Time


    }

}
