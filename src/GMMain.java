/* Class GMMain 
 * GMM: Gaussian Mixture Model
 * Project by Gurpreet Singh
 * Machine Learning - CS 3813
 * Description: 
 *   1) Creates and Initiates a GMModel Object
 *   2) Create Model for Different Thresholds
 *   3) Output Parameters for different thresholds
 * @param Gmm  GMModel Object
 * @author Gurpreet Singh 
 */
public class GMMain {
	public static GMModel Gmm;
    public static void main(String[] args) {             // main function
		
		 Gmm = new GMModel();             
		 
		 for(int i=0; i< Gmm.Threshold.length; i++){
		    Gmm.GaussianMixtureModel(i);             // To build GM Model
		    Gmm.OutputFinalReport(i);                // To Output Final Report
		    Gmm.ResetValues();                       // Resetting Value for Next Threshold GMM
		 }
		
		 
	}  // Main function ends here..

}   // Class GMMain Ends here...
