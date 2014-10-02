/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demots;

/**
 *
 * @author chiayin
 */
public class Record {
    private int recId;
    private String problem;
    private String date;
    private String solution;
    private boolean unsolved;
    
    private static int nextId = 1;
    
    public Record() {
        recId = nextId++;
    }
    
    public Record(String problem, String date, String solution, boolean unsolved) {
        this.problem = problem;     this.date = date;
        this.solution = solution;   this.unsolved = unsolved; 
        recId = nextId++;
    }
}
