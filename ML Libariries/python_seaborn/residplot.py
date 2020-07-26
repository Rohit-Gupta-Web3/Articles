import numpy as np  
import seaborn as sns  
sns.set(style="whitegrid")  
  
# Make an example dataset with y ~ x  
rs = np.random.RandomState(10)  
x = rs.normal(2, 1, 75)  
y = 2 + 1.5 * x + rs.normal(1, 2, 75)  
  
# Plot the residuals after fitting a linear model  
sns.residplot(x, y, lowess=True, color="g")  
