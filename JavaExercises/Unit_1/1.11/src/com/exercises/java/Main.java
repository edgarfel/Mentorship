package com.exercises.java;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger second= BigInteger.valueOf(2);
        BigInteger third= BigInteger.valueOf(3);
        BigInteger fourth= BigInteger.valueOf(4);
        BigInteger fifth= BigInteger.valueOf(5);
        BigInteger population = BigInteger.valueOf(312032486);
        BigInteger secondsPerYear= BigInteger.valueOf(365*(24*3600));
        BigInteger birthsPerYear = BigInteger.valueOf((365*(24*3600))/7);
        BigInteger deathPerYear = BigInteger.valueOf((365*(24*3600))/13);
        BigInteger immigrantPerYear = BigInteger.valueOf((365*(24*3600))/45);
        BigInteger totalPerYear = birthsPerYear.add(immigrantPerYear);
        totalPerYear=totalPerYear.subtract(deathPerYear);
        BigInteger secondYear = totalPerYear.multiply(second);
        BigInteger thirdYear = totalPerYear.multiply(third);
        BigInteger fourthYear = totalPerYear.multiply(fourth);
        BigInteger fifthYear = totalPerYear.multiply(fifth);
        BigInteger totalPopulation = population.add(totalPerYear);
        BigInteger secondYearPopulation=secondYear.add(population);
        BigInteger thirdYearPopulation=thirdYear.add(population);
        BigInteger fourthYearPopulation=fourthYear.add(population);
        BigInteger fifthYearPopulation=fifthYear.add(population);
        System.out.println("First year the population will be: "+totalPopulation);
        System.out.println("Second year the population will be: "+secondYearPopulation);
        System.out.println("Third year the population will be: "+thirdYearPopulation);
        System.out.println("Fourth year the population will be: "+fourthYearPopulation);
        System.out.println("Fifth year the population will be: "+fifthYearPopulation);

    }
}
