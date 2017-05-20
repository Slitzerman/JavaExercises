import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Created by Niko Pinnis on 14.5.2017
 * for project: Percolation.
 * version 1.0.0
 */

public class Percolation {

    private WeightedQuickUnionUF data;
    private boolean[][] openSiteMap; // open sites are true
    private int numberOfOpenSites;
    private int rowlen;


    // create n-by-n grid, with all sites blocked
    public Percolation(int n){

        if(n <= 0)
            throw new IllegalArgumentException("n must be a positive integer");
        data = new WeightedQuickUnionUF(n * n);
        numberOfOpenSites = 0;
        rowlen = n;
        openSiteMap = new boolean[n][n];
        for (boolean[] x : openSiteMap
             ) {
            for (boolean y: x
                 ) {
                y = false;

            }
        }

    }

    // open site (row, col) if it is not open already
    public void open(int row, int col){
        if(row <= 0 | col <= 0)
            throw new IllegalArgumentException("row and col must be positive integers");
        if(isOpen(row,col))
            return;
        row--;
        col--;
        openSiteMap[row][col] = true;
        numberOfOpenSites++;

        // check if site above exists and is open
        if(row > 0){
            if(isOpen(row,col+1)){
                data.union(rowlen * (row-1) + col,rowlen * row + col);
            }
        }
        // check if site below exists and is open
        if(row < rowlen-1){
            if(isOpen(row+2,col+1)){
                data.union(rowlen * row + col,rowlen * (row+1) + col);
            }
        }
        // check if site left exists and is open
        if(col > 0){
            if(isOpen(row+1, col)){
                data.union(rowlen*row+(col-1),rowlen*row+col);
            }
        }

        // check if site right exists and is open
        if(col < rowlen-1){
            if(isOpen(row+1, col+2)){
                data.union(rowlen*row+col,rowlen*row+col+1);
            }
        }

    }
    // is site (row, col) open?
    public boolean isOpen(int row, int col){
        if(row <= 0 | col <= 0)
            throw new IllegalArgumentException("row and col must be positive integers");
        return openSiteMap[row-1][col-1];

    }

    // is site (row, col) full?
    public boolean isFull(int row, int col){
        if(row <= 0 | col <= 0)
            throw new IllegalArgumentException("row and col must be positive integers");

        return !openSiteMap[row-1][col-1];
    }

    // number of open sites
    public int numberOfOpenSites(){
        return numberOfOpenSites;
    }

    // does the system percolate?
    public boolean percolates()     {
        for (int top = 0; top < rowlen; top++){
            for(int bot=0; bot < rowlen; bot++){
                //System.out.println("top is " + top + " bot is: " + bot);
                if(data.connected(top,(rowlen-1)*rowlen+bot)){
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {

        Percolation testcase = new Percolation(9);

        testcase.open(1,5);
        testcase.open(2,5);
        testcase.open(2,6);
        testcase.open(3,6);
        testcase.open(3,5);
        testcase.open(4,5);
        testcase.open(5,5);
        testcase.open(6,5);
        testcase.open(7,5);
        testcase.open(8,5);
        testcase.open(9,5);

        System.out.println("is 1 5 open? " + testcase.isOpen(1,5));
        System.out.println("is 2 5 open? " + testcase.isOpen(2,5));
        System.out.println("is 2 6 open? " + testcase.isOpen(2,6));
        System.out.println("is 3 6 open? " + testcase.isOpen(3,6));
        System.out.println("is 3 6 open? " + testcase.isOpen(3,5));
        System.out.println("is 4 5 open? " + testcase.isOpen(4,5));
        System.out.println("is 5 5 open? " + testcase.isOpen(5,5));
        System.out.println("is 6 5 open? " + testcase.isOpen(6,5));
        System.out.println("is 7 5 open? " + testcase.isOpen(7,5));
        System.out.println("is 8 5 open? " + testcase.isOpen(8,5));
        System.out.println("is 9 5 open? " + testcase.isOpen(9,5));


        System.out.println("num of open sites: " + testcase.numberOfOpenSites());

        System.out.println("does it percolate? " + testcase.percolates());

        

    }

}