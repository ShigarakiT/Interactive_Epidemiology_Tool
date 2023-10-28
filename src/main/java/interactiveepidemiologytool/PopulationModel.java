package interactiveepidemiologytool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PopulationModel {

private int population; // Population defined by user
private int timeframe;  // In days, controls # of loops, defined by user
private int infected;   // Initial # of infected people, defined by user
private double infectionRate;   // Infection rate, preselected variable by disease
private double recoveryStart;   // Format: 1 / Random number between average start and end, preselected variable by disease
private double recoveryEnd;
private double incubationStart; // Format: 1 / days-until-sickness, preselected variable by disease
private double incubationEnd;
List<Double> S = new ArrayList<>();
List<Double> E = new ArrayList<>();
List<Double> I = new ArrayList<>();
List<Double> R = new ArrayList<>();

public void setPop(int pop){
    population = pop;
}

public void setTimeframe(int time){
    timeframe = time;
}

public void setInfected(int inf){
    infected = inf;
}

public void setInfectionRate(double beta){
    infectionRate = beta;
}

public void setRecovery(double start, double end){
    recoveryStart = start;
    recoveryEnd = end;
}

public void setIncubation(double start, double end){
    incubationStart = start;
    incubationEnd = end;
}

// I have two proposed ways to affect the outputs by safeguards:
// 1. Change the infection rate
// 2. Subtract the effectiveness effect on the population from
//    the number of susceptible and add it to the number of recovered
// I think 1. will be better for a live model.. but we don't have any visual model
// 2 is also super easy to implement so it isn't a problem
public double setRateCovid(double vaccine, double quarantine){
        // TODO: Initial values need more thought
        // I looked at other models and they either something extremely complex
        // or what appears to be a conservative guess
        // These are conservative guesses
        final double covidBase = 0.2;
        
        // 1 - (% of population * effectiveness of safeguard / population)
        double vacEff = 1 - (((population * (vaccine / 100.0)) * 0.6) / population);
        double quarEff = 1 - (((population * (quarantine / 100.0)) * 0.4) / population);
                
        double rate = covidBase * vacEff * quarEff;
        
        return rate;
    }

public double setRateFlu(double vaccine, double quarantine){
        // TODO: See above for covidBase
        final double fluBase = 0.18;
        
        // 1 - (% of population * effectiveness of safeguard / population)
        double vacEff = 1 - (((population * (vaccine / 100.0)) * 0.3) / population);
        double quarEff = 1 - (((population * (quarantine / 100.0)) * 0.8) / population);
                
        double rate = fluBase * vacEff * quarEff;
        
        return rate;
    }

public void simulate() {
    S.add((double) population - infected);    // Initial PopulationModel values
    E.add((double) infected);
    I.add((double) infected);
    R.add(0.0);

    for (int i = 0; i < timeframe; i++) {
        double[] derivative = derive(i);
        S.add(derivative[0]);
        E.add(derivative[1]);
        I.add(derivative[2]);
        R.add(derivative[3]);
    }
}

private double[] derive(int day) {
    double dS = (infectionRate * S.get(day) * I.get(day)) / population;
    double recovery = 1 / ThreadLocalRandom.current().nextDouble(recoveryStart, recoveryEnd);
    double incubation = 1 / ThreadLocalRandom.current().nextDouble(incubationStart, incubationEnd);
    
    double newS = S.get(day) - (dS);
    double newE = E.get(day) + (dS - (incubation * E.get(day)));
    double newI = I.get(day) + ((incubation * E.get(day)) - (recovery * I.get(day)));
    double newR = R.get(day) + (recovery * I.get(day));
    
    return new double[] {newS, newE, newI, newR};
}

    public static void main(String[] args) {
        MainPage frame = new MainPage();
        frame.setVisible(true);
    }
}