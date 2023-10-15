package interactiveepidemiologytool;

import java.util.ArrayList;
import java.util.List;

public class SEIR {

private int population; // Population defined by user
private int timeframe;  // In days, controls # of loops, defined by user
private int infected;   // Initial # of infected people, defined by user
private double infectionRate;   // Infection rate, preselected variable by disease
private double recovery;        // Format: 1 / days-until-recovery, preselected variable by disease
private double incubation;      // Format: 1 / days-until-sickness, preselected variable by disease
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

public void setRecovery(double gamma){
    recovery = gamma;
}

public void setIncubation(double inc){
    incubation = inc;
}

public void createData() {
    S.add((double) population - infected);    // Initial SEIR values
    E.add((double) infected);
    I.add((double) infected);
    R.add(0.0);

    for (int i = 0; i < timeframe; i++) {
        double[] derivative = deriv(i);
        S.add(derivative[0]);
        E.add(derivative[1]);
        I.add(derivative[2]);
        R.add(derivative[3]);
    }
}

private double[] deriv(int day) {
    double dS = (infectionRate * S.get(day) * I.get(day)) / population;
    double newS = S.get(day) - (dS);
    double newE = E.get(day) + (dS - (incubation * E.get(day)));
    double newI = I.get(day) + ((incubation * E.get(day)) - (recovery * I.get(day)));
    double newR = R.get(day) + (recovery * I.get(day));
    
    return new double[] {newS, newE, newI, newR};
}

    public static void main(String[] args) {
        IET frame = new IET();
        frame.setVisible(true); //or whatever the method is in jframe.class
    }
}