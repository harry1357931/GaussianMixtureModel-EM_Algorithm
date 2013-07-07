GaussianMixtureModel-ExpectaionMaximization Algorithm
======================================================

For Algorithms used and Experimental Results:
=============================================
Check File: <b>FinalReport3.doc</b>

Gaussian Mixture Model:
=======================
A Gaussian Mixture Model (GMM) is a parametric probability density function represented as a weighted sum of Gaussian component densities. 
GMMs are commonly used as a parametric model of the probability distribution of continuous measurements or features in a biometric system, 
such as vocal-tract related spectral features in a speaker recognition system. GMM parameters are estimated from training data using the iterative 
Expectation-Maximization (EM) algorithm or Maximum A Posteriori (MAP) estimation from a well-trained prior model.
<br>
For a good summary of <b>Gaussian Mixture Model</b>:<br>
Check File: <b>FinalReport3.doc</b><br>
Visit Link: http://en.wikipedia.org/wiki/Mixture_model

Expectation Maximization:
=========================
An expectation–maximization (EM) algorithm is an iterative method for finding maximum likelihood or maximum a posteriori (MAP) estimates of parameters 
in statistical models, where the model depends on unobserved latent variables. 
Expectation maximization (EM) is seemingly the most popular technique used to determine the parameters of a mixture with an a priori given number of c
omponents. This is a particular way of implementing maximum likelihood estimation for this problem. EM is of particular appeal for finite normal mixtures 
where closed-form expressions are possible.
The EM iteration alternates between performing an expectation (E) step, 
which creates a function for the expectation of the log-likelihood evaluated using the current estimate for the parameters, and a maximization (M) step, 
which computes parameters maximizing the expected log-likelihood found on the E step. These parameter-estimates are then used to determine the distribution 
of the latent variables in the next E step.
<br>
<b>Filtering and smoothing EM algorithms</b> arise by repeating the following <b>two-step procedure</b>.<br>
<b>E-Step</b><br>
&nbsp;&nbsp;&nbsp;&nbsp;Operate a minimum-variance smoother designed with current parameter estimates to obtain updated state estimates.<br>
<b>M-Step</b><br>
&nbsp;&nbsp;&nbsp;&nbsp;Use the filtered or smoothed state estimates within maximum-likelihood calculations to obtain updated parameter estimates.
<br>
For More Info. on EM algorithm: <br>


Input File having datapoints:
=============================
'samples_add.text'

Output:
=======
GMM Parameters Pi, Mu(Mean), and Sigma(Co-Variance) are outputted for each group in a 3 group mixture at varying thresholds. <br>
<b>Sample Output Images</b> when Input file is <b>samples_add.text</b> <br>
 &nbsp;&nbsp;&nbsp;&nbsp; Output_BestSetOfParametersAtThreshold_0.0001.png   <br>
 &nbsp;&nbsp;&nbsp;&nbsp; Output_BestSetOfParametersAtThreshold_0.001.png   <br>
 &nbsp;&nbsp;&nbsp;&nbsp; Output_BestSetOfParametersAtThreshold_0.01.png   <br>
 &nbsp;&nbsp;&nbsp;&nbsp; Output_BestSetOfParametersAtThreshold_0.1.png   <br>
