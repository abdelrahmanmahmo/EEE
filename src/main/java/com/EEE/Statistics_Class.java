package com.EEE;

public class Statistics_Class {
	int num_of_intervals;
	int beginning;
	int length;
	double N;
	int[]interval;
	int[]frequency;
	int[]Midpoint;
	
	public Statistics_Class(int num,int a,int l) {
		N=0;
		num_of_intervals=num;
		beginning=a;
		length=l;
		interval=new int[num_of_intervals];
		frequency=new int[num_of_intervals];
		Midpoint=new int[num_of_intervals];
		 
		 interval[0]=beginning;
	    for (int i = 1; i < num_of_intervals; i++) {
	    	interval[i]=beginning+= length; 
	    }
	    
	   for (int i = 0; i < num_of_intervals; i++) {
		   if(i==num_of_intervals-1)
	    	 Midpoint[i]=(interval[i]+interval[i]+ length)/2;
		   else
			 Midpoint[i]=(interval[i]+interval[i+1])/2;
	    }
	}
	
	public void set_frequency(int[] freq) {
	    for (int i = 0; i < num_of_intervals; i++) {
	        frequency[i] = freq[i];
	        N += frequency[i];
	    }
	}

	
	public double calculate_mean() {
		 int[] xf=new int[num_of_intervals];
		    double sum_xf=0;
		    for (int i = 0; i < num_of_intervals; i++) {
		     	 xf[i]=Midpoint[i]*frequency[i];
		     	sum_xf+=xf[i];
		     }
		   return sum_xf/N;
	}
	
	public double calculate_Variance(double mean) {
		  int[] x2f=new int[num_of_intervals];
		    double sum_x2f=0;
		    for (int i = 0; i < num_of_intervals; i++) {
		     	 x2f[i]=Midpoint[i]*Midpoint[i]*frequency[i];
		     	sum_x2f+=x2f[i];
		     }
		    return (sum_x2f-N*mean*mean)/N;
	}
	
   public double calculate_mode() {
	   double fk=frequency[0];
	    double fk_1=0.0;
	    double fk1=0.0;
	    double A_mode=0.0;
	    for (int f=0; f < num_of_intervals; f++) {
	    	if(frequency[f]>fk) {
	    		fk=frequency[f];
	    	    fk_1=frequency[f-1];
	    	    fk1=frequency[f+1];
	    	    A_mode=interval[f];
	    	}
	    }
	    return A_mode+((fk-fk_1)/(2*fk-fk1-fk_1)*length);
	    }
   
   public double calculate_median() { 
	   int[] cf=new int[num_of_intervals];
	    int sum_cf=0;
	    for (int i = 0; i < num_of_intervals; i++) {
	     	 cf[i]=frequency[i]+sum_cf;
	     	sum_cf+=frequency[i];
	     }
	    double half_N=N/2;
	    double fk_median=0.0;
	    double A_median=0.0;
	    double cfk_1=0.0;
	    for(int i=0;i<num_of_intervals;i++) {
	    	if(half_N<=cf[i]) {
	    		A_median=interval[i];
	    		fk_median=frequency[i];
	    		cfk_1=cf[i-1];
	    		break;
	    	}
	    }
	    return A_median+((half_N-cfk_1)/fk_median)*length;
   }
		

}
