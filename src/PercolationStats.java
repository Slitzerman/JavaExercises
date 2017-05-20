import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

import static java.lang.Integer.parseInt;

/**
 * Created by Niko Pinnis on 21.5.2017
 * for project: Percolation.
 * version 1.0.0
 */
public class PercolationStats {

    private int totalSites;
    private int openSites[];
    double[] thresholds;
    private double mean;
    private double stdDev;
    private int totalTrials;

    public PercolationStats(int n, int trials){
        if(n <= 0 | trials <= 0) throw new IllegalArgumentException("invalid arguments: n and trials must be positive");

        totalTrials = trials;
        totalSites = n * n;
        openSites = new int[trials];
        thresholds = new double[totalTrials];
        mean = 0;
        stdDev = 0;

        int x = 0;
        int y = 0;
        for(int trial = 0; trial < trials; trial++){
            Percolation lattice = new Percolation(n);
            openSites[trial] = 0;
            while(!lattice.percolates()){
                do {
                    x = StdRandom.uniform(1, n+1);
                    y = StdRandom.uniform(1, n+1);
                } while(lattice.isOpen(x,y));
                lattice.open(x,y);

            }
            openSites[trial] = lattice.numberOfOpenSites();

        }
    }

    public double mean(){

        if(this.mean != 0) return this.mean;

        for(int x=0; x<openSites.length; x++){
            thresholds[x] = (double)openSites[x]/totalSites;

        }
        mean = StdStats.mean(thresholds);

        return mean;
    }


    public double stddev(){
        if(this.stdDev != 0) return this.stdDev;
        stdDev = StdStats.stddev(thresholds);

        return stdDev;
    }


    public double confidenceLo(){
        if(mean == 0){
            mean = mean();
        }
        if(stdDev == 0){
            stdDev = stddev();
        }

        return mean - (1.96*Math.sqrt(stdDev)/Math.sqrt(totalTrials));
    }

    public double confidenceHi(){
        if(mean == 0){
            mean = mean();
        }
        if(stdDev == 0){
            stdDev = stddev();
        }

        return mean + (1.96*Math.sqrt(stdDev)/Math.sqrt(totalTrials));
    }

    public static void main(String[] args){

        int size = parseInt(args[0]);
        int repetitions = parseInt(args[1]);

        PercolationStats estimation = new PercolationStats(size, repetitions);

        System.out.println("mean                    = " + estimation.mean());
        System.out.println("stddev                  = " + estimation.stddev());
        System.out.println("95% confidence interval = [" + estimation.confidenceLo() + ", " + estimation.confidenceHi() + "]");


    }

}
