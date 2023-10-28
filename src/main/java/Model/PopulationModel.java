package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * PopulationModel is the model for the program.
 * PopulationModel creates a SEIR model that simulates a population of people.
 * The variables of PopulationModel are user defined in order to emphasize interactivity.
 * Population, timeframe, and infected are all decided directly by the user using a slider.
 * timeframe controls the number of loops for simulate and is used to get the ending values
 * of SEIR lists. 
 * 
 * infectionRate, recoveryStart/End, and incubationStart/End are determined by a preset data 
 * group based on the user's disease selection in the GUI.
 */
public class PopulationModel {

    private int population; // Population defined by user
    private int timeframe;  // In days, controls # of loops, defined by user
    private int infected;   // Initial # of infected people, defined by user
    private double infectionRate;   // Infection rate, preselected variable by disease
    private double recoveryStart;   // Format: 1 / Random number between average start and end, preselected variable by disease
    private double recoveryEnd;
    private double incubationStart; // Format: 1 / days-until-sickness, preselected variable by disease
    private double incubationEnd;
    public List<Double> S = new ArrayList<>();
    public List<Double> E = new ArrayList<>();
    public List<Double> I = new ArrayList<>();
    public List<Double> R = new ArrayList<>();

    public void setPop(int pop){
        population = pop;
    }

    public void setTimeframe(int time){
        timeframe = time;
    }

    public int getTimeframe(){
        return timeframe;
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

    /** 
     * setRateCovid creates an infection rate to be used by the simulate as a
     * variable for the SEIR model using the concept of Covid-19.
     * @param vaccine   A value from the GUI decided by the user using a slider
     * @param quarantine    A value from the GUI decided by the user using a slider
     * @return  Returns the infection rate necessary for simulate
     * 
     * TODO: Initial values need more thought
     * I looked at other models and they either something extremely complex
     * or what appears to be a conservative guess
     * These are conservative guesses
     */
    public double setRateCovid(double vaccine, double quarantine){
            final double covidBase = 0.2;

            // 1 - (% of population * effectiveness of safeguard / population)
            double vacEff = 1 - (((population * (vaccine / 100.0)) * 0.6) / population);
            double quarEff = 1 - (((population * (quarantine / 100.0)) * 0.4) / population);

            double rate = covidBase * vacEff * quarEff;

            return rate;
        }

    /** 
     * setRateFlu creates an infection rate to be used by the simulate as a
     * variable for the SEIR model using the concept of influenza.
     * @param vaccine   A value from the GUI decided by the user using a slider
     * @param quarantine    A value from the GUI decided by the user using a slider
     * @return  Returns the infection rate necessary for simulate
     * 
     * TODO: Initial values need more thought
     * I looked at other models and they either something extremely complex
     * or what appears to be a conservative guess
     * These are conservative guesses
     */
    public double setRateFlu(double vaccine, double quarantine){
            final double fluBase = 0.18;

            // 1 - (% of population * effectiveness of safeguard / population)
            double vacEff = 1 - (((population * (vaccine / 100.0)) * 0.3) / population);
            double quarEff = 1 - (((population * (quarantine / 100.0)) * 0.8) / population);

            double rate = fluBase * vacEff * quarEff;

            return rate;
        }

    /**
     * simulate creates the model data and adds it to the lists S, E, I, and R based 
     * on the data collected from the user.
     * simulate initializes the first set of data based entirely on user input
     * and then calculates the continuing days based on the timeframe variable.
     * 
     * timeframe, infectionRate, population, recoveryStart/End, incubationStart/End
     * all must be collected before simulate can be ran.
     * 
     * The calculations are based on formula for the SEIR model.
     */
    public void simulate() {
        S.add((double) population - infected);    // Initial PopulationModel values
        E.add((double) infected);
        I.add((double) infected);
        R.add(0.0);

        for (int i = 0; i < timeframe; i++) {
            double newlyExposed = (infectionRate * S.get(i) * I.get(i)) / population;
            double recovery = 1 / ThreadLocalRandom.current().nextDouble(recoveryStart, recoveryEnd);
            double incubation = 1 / ThreadLocalRandom.current().nextDouble(incubationStart, incubationEnd);

            double newS = S.get(i) - (newlyExposed);
            double newE = E.get(i) + (newlyExposed - (incubation * E.get(i)));
            double newI = I.get(i) + ((incubation * E.get(i)) - (recovery * I.get(i)));
            double newR = R.get(i) + (recovery * I.get(i));
            
            S.add(newS);
            E.add(newE);
            I.add(newI);
            R.add(newR);
        }
    }
}
